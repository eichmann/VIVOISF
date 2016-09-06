package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechFeaturesIterator theSpeechFeaturesIterator = (SpeechFeaturesIterator)findAncestorWithClass(this, SpeechFeaturesIterator.class);
			pageContext.getOut().print(theSpeechFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for features tag ");
		}
		return SKIP_BODY;
	}
}

