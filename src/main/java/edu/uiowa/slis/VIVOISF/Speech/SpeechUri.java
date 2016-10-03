package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechUri currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechUriIterator theSpeech = (SpeechUriIterator)findAncestorWithClass(this, SpeechUriIterator.class);
			pageContext.getOut().print(theSpeech.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for uri tag ");
		}
		return SKIP_BODY;
	}
}

