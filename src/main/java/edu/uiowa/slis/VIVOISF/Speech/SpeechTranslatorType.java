package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechTranslatorIterator theSpeechTranslatorIterator = (SpeechTranslatorIterator)findAncestorWithClass(this, SpeechTranslatorIterator.class);
			pageContext.getOut().print(theSpeechTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for translator tag ");
		}
		return SKIP_BODY;
	}
}

