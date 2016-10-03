package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechPages currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechPagesIterator theSpeech = (SpeechPagesIterator)findAncestorWithClass(this, SpeechPagesIterator.class);
			pageContext.getOut().print(theSpeech.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for pages tag ");
		}
		return SKIP_BODY;
	}
}

