package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechCitedByIterator theSpeechCitedByIterator = (SpeechCitedByIterator)findAncestorWithClass(this, SpeechCitedByIterator.class);
			pageContext.getOut().print(theSpeechCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

