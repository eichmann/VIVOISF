package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechNumberIterator theSpeech = (SpeechNumberIterator)findAncestorWithClass(this, SpeechNumberIterator.class);
			pageContext.getOut().print(theSpeech.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for number tag ");
		}
		return SKIP_BODY;
	}
}

