package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechFeaturesIterator theSpeechFeaturesIterator = (SpeechFeaturesIterator)findAncestorWithClass(this, SpeechFeaturesIterator.class);
			pageContext.getOut().print(theSpeechFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for features tag ");
		}
		return SKIP_BODY;
	}
}

