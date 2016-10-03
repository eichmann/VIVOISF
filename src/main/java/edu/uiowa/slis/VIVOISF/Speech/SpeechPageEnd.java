package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechPageEndIterator theSpeech = (SpeechPageEndIterator)findAncestorWithClass(this, SpeechPageEndIterator.class);
			pageContext.getOut().print(theSpeech.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

