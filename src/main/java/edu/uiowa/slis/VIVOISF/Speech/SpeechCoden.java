package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechCodenIterator theSpeech = (SpeechCodenIterator)findAncestorWithClass(this, SpeechCodenIterator.class);
			pageContext.getOut().print(theSpeech.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for coden tag ");
		}
		return SKIP_BODY;
	}
}

