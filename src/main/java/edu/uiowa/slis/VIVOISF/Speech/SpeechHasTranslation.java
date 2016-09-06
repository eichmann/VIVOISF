package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechHasTranslationIterator theSpeechHasTranslationIterator = (SpeechHasTranslationIterator)findAncestorWithClass(this, SpeechHasTranslationIterator.class);
			pageContext.getOut().print(theSpeechHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

