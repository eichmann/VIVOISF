package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechCitedByIterator theSpeechCitedByIterator = (SpeechCitedByIterator)findAncestorWithClass(this, SpeechCitedByIterator.class);
			pageContext.getOut().print(theSpeechCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

