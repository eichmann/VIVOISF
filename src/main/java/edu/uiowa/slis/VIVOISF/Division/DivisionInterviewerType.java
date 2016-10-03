package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionInterviewerIterator theDivisionInterviewerIterator = (DivisionInterviewerIterator)findAncestorWithClass(this, DivisionInterviewerIterator.class);
			pageContext.getOut().print(theDivisionInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

