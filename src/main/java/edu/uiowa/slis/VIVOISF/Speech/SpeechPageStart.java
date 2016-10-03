package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechPageStartIterator theSpeech = (SpeechPageStartIterator)findAncestorWithClass(this, SpeechPageStartIterator.class);
			pageContext.getOut().print(theSpeech.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

