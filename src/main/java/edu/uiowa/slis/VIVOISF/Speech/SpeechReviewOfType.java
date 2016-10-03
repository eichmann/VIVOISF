package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechReviewOfIterator theSpeechReviewOfIterator = (SpeechReviewOfIterator)findAncestorWithClass(this, SpeechReviewOfIterator.class);
			pageContext.getOut().print(theSpeechReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

