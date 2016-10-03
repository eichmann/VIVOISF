package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechSection currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechSectionIterator theSpeech = (SpeechSectionIterator)findAncestorWithClass(this, SpeechSectionIterator.class);
			pageContext.getOut().print(theSpeech.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for section tag ");
		}
		return SKIP_BODY;
	}
}

