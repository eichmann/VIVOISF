package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechReproducedInIterator theSpeechReproducedInIterator = (SpeechReproducedInIterator)findAncestorWithClass(this, SpeechReproducedInIterator.class);
			pageContext.getOut().print(theSpeechReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

