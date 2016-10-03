package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailTranscriptOfIterator theEmailTranscriptOfIterator = (EmailTranscriptOfIterator)findAncestorWithClass(this, EmailTranscriptOfIterator.class);
			pageContext.getOut().print(theEmailTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

