package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechDoiIterator theSpeech = (SpeechDoiIterator)findAncestorWithClass(this, SpeechDoiIterator.class);
			pageContext.getOut().print(theSpeech.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for doi tag ");
		}
		return SKIP_BODY;
	}
}

