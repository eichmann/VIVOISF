package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionIntervieweeInverseIterator theDivisionIntervieweeInverseIterator = (DivisionIntervieweeInverseIterator)findAncestorWithClass(this, DivisionIntervieweeInverseIterator.class);
			pageContext.getOut().print(theDivisionIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

