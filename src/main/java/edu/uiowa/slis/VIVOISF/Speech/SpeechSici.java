package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechSici currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechSiciIterator theSpeech = (SpeechSiciIterator)findAncestorWithClass(this, SpeechSiciIterator.class);
			pageContext.getOut().print(theSpeech.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for sici tag ");
		}
		return SKIP_BODY;
	}
}

