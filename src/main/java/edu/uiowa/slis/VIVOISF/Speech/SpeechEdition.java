package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechEditionIterator theSpeech = (SpeechEditionIterator)findAncestorWithClass(this, SpeechEditionIterator.class);
			pageContext.getOut().print(theSpeech.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for edition tag ");
		}
		return SKIP_BODY;
	}
}

