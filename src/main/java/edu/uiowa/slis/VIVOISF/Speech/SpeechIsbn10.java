package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechIsbn10Iterator theSpeech = (SpeechIsbn10Iterator)findAncestorWithClass(this, SpeechIsbn10Iterator.class);
			pageContext.getOut().print(theSpeech.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

