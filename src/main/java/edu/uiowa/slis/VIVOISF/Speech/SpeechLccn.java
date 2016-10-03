package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechLccnIterator theSpeech = (SpeechLccnIterator)findAncestorWithClass(this, SpeechLccnIterator.class);
			pageContext.getOut().print(theSpeech.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for lccn tag ");
		}
		return SKIP_BODY;
	}
}

