package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechOwnerIterator theSpeechOwnerIterator = (SpeechOwnerIterator)findAncestorWithClass(this, SpeechOwnerIterator.class);
			pageContext.getOut().print(theSpeechOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for owner tag ");
		}
		return SKIP_BODY;
	}
}

