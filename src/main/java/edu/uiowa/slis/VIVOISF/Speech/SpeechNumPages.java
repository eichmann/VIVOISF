package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechNumPagesIterator theSpeech = (SpeechNumPagesIterator)findAncestorWithClass(this, SpeechNumPagesIterator.class);
			pageContext.getOut().print(theSpeech.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for numPages tag ");
		}
		return SKIP_BODY;
	}
}

