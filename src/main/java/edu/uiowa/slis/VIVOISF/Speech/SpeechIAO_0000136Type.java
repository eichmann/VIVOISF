package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechIAO_0000136Iterator theSpeechIAO_0000136Iterator = (SpeechIAO_0000136Iterator)findAncestorWithClass(this, SpeechIAO_0000136Iterator.class);
			pageContext.getOut().print(theSpeechIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

