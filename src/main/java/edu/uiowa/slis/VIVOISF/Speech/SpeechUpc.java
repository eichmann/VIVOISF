package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechUpcIterator theSpeech = (SpeechUpcIterator)findAncestorWithClass(this, SpeechUpcIterator.class);
			pageContext.getOut().print(theSpeech.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for upc tag ");
		}
		return SKIP_BODY;
	}
}

