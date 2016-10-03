package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationInterviewerIterator theFoundationInterviewerIterator = (FoundationInterviewerIterator)findAncestorWithClass(this, FoundationInterviewerIterator.class);
			pageContext.getOut().print(theFoundationInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

