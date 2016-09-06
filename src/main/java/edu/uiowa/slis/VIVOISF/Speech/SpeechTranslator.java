package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechTranslatorIterator theSpeechTranslatorIterator = (SpeechTranslatorIterator)findAncestorWithClass(this, SpeechTranslatorIterator.class);
			pageContext.getOut().print(theSpeechTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for translator tag ");
		}
		return SKIP_BODY;
	}
}

