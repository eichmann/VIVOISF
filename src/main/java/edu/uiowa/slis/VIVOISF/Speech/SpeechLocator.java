package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechLocatorIterator theSpeech = (SpeechLocatorIterator)findAncestorWithClass(this, SpeechLocatorIterator.class);
			pageContext.getOut().print(theSpeech.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for locator tag ");
		}
		return SKIP_BODY;
	}
}

