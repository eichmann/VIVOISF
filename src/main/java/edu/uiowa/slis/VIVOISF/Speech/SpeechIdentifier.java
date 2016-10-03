package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechIdentifierIterator theSpeech = (SpeechIdentifierIterator)findAncestorWithClass(this, SpeechIdentifierIterator.class);
			pageContext.getOut().print(theSpeech.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for identifier tag ");
		}
		return SKIP_BODY;
	}
}

