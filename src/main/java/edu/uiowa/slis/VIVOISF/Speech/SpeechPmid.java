package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechPmidIterator theSpeech = (SpeechPmidIterator)findAncestorWithClass(this, SpeechPmidIterator.class);
			pageContext.getOut().print(theSpeech.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for pmid tag ");
		}
		return SKIP_BODY;
	}
}

