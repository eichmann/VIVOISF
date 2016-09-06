package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechCites currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechCitesIterator theSpeechCitesIterator = (SpeechCitesIterator)findAncestorWithClass(this, SpeechCitesIterator.class);
			pageContext.getOut().print(theSpeechCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for cites tag ");
		}
		return SKIP_BODY;
	}
}

