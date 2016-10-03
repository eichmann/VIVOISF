package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechContent currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechContentIterator theSpeech = (SpeechContentIterator)findAncestorWithClass(this, SpeechContentIterator.class);
			pageContext.getOut().print(theSpeech.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for content tag ");
		}
		return SKIP_BODY;
	}
}

