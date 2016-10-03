package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechProducerIterator theSpeechProducerIterator = (SpeechProducerIterator)findAncestorWithClass(this, SpeechProducerIterator.class);
			pageContext.getOut().print(theSpeechProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for producer tag ");
		}
		return SKIP_BODY;
	}
}

