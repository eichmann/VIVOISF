package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechRO_0000056Iterator theSpeechRO_0000056Iterator = (SpeechRO_0000056Iterator)findAncestorWithClass(this, SpeechRO_0000056Iterator.class);
			pageContext.getOut().print(theSpeechRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

