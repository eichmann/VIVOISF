package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechHandleIterator theSpeech = (SpeechHandleIterator)findAncestorWithClass(this, SpeechHandleIterator.class);
			pageContext.getOut().print(theSpeech.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for handle tag ");
		}
		return SKIP_BODY;
	}
}

