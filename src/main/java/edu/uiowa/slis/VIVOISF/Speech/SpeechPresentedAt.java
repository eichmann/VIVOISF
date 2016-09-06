package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechPresentedAtIterator theSpeechPresentedAtIterator = (SpeechPresentedAtIterator)findAncestorWithClass(this, SpeechPresentedAtIterator.class);
			pageContext.getOut().print(theSpeechPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

