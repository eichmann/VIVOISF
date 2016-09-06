package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechTheAbstractIterator theSpeech = (SpeechTheAbstractIterator)findAncestorWithClass(this, SpeechTheAbstractIterator.class);
			pageContext.getOut().print(theSpeech.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

