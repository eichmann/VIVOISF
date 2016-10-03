package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechIssuerIterator theSpeechIssuerIterator = (SpeechIssuerIterator)findAncestorWithClass(this, SpeechIssuerIterator.class);
			pageContext.getOut().print(theSpeechIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for issuer tag ");
		}
		return SKIP_BODY;
	}
}

