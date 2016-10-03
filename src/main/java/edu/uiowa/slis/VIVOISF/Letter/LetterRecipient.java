package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterRecipient extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterRecipient currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterRecipient.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterRecipientIterator theLetterRecipientIterator = (LetterRecipientIterator)findAncestorWithClass(this, LetterRecipientIterator.class);
			pageContext.getOut().print(theLetterRecipientIterator.getRecipient());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for recipient tag ");
		}
		return SKIP_BODY;
	}
}

