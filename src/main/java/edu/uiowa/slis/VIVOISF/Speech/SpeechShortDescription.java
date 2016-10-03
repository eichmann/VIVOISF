package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechShortDescriptionIterator theSpeech = (SpeechShortDescriptionIterator)findAncestorWithClass(this, SpeechShortDescriptionIterator.class);
			pageContext.getOut().print(theSpeech.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

