package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechTranslationOfIterator theSpeechTranslationOfIterator = (SpeechTranslationOfIterator)findAncestorWithClass(this, SpeechTranslationOfIterator.class);
			pageContext.getOut().print(theSpeechTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

