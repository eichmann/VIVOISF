package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionInterviewerInverseIterator theDivisionInterviewerInverseIterator = (DivisionInterviewerInverseIterator)findAncestorWithClass(this, DivisionInterviewerInverseIterator.class);
			pageContext.getOut().print(theDivisionInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

