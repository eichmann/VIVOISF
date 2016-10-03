package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechGtin14Iterator theSpeech = (SpeechGtin14Iterator)findAncestorWithClass(this, SpeechGtin14Iterator.class);
			pageContext.getOut().print(theSpeech.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

