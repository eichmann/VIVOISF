package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailTranscriptOfIterator theEmailTranscriptOfIterator = (EmailTranscriptOfIterator)findAncestorWithClass(this, EmailTranscriptOfIterator.class);
			pageContext.getOut().print(theEmailTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

