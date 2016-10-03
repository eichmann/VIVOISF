package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechShortTitleIterator theSpeech = (SpeechShortTitleIterator)findAncestorWithClass(this, SpeechShortTitleIterator.class);
			pageContext.getOut().print(theSpeech.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

