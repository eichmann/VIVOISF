package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationInterviewerInverseIterator theFoundationInterviewerInverseIterator = (FoundationInterviewerInverseIterator)findAncestorWithClass(this, FoundationInterviewerInverseIterator.class);
			pageContext.getOut().print(theFoundationInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

