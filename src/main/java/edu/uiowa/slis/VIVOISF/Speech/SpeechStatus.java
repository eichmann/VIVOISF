package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechStatusIterator theSpeechStatusIterator = (SpeechStatusIterator)findAncestorWithClass(this, SpeechStatusIterator.class);
			pageContext.getOut().print(theSpeechStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for status tag ");
		}
		return SKIP_BODY;
	}
}

