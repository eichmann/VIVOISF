package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationIntervieweeInverseIterator theFoundationIntervieweeInverseIterator = (FoundationIntervieweeInverseIterator)findAncestorWithClass(this, FoundationIntervieweeInverseIterator.class);
			pageContext.getOut().print(theFoundationIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

