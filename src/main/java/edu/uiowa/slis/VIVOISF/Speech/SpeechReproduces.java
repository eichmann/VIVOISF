package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechReproducesIterator theSpeechReproducesIterator = (SpeechReproducesIterator)findAncestorWithClass(this, SpeechReproducesIterator.class);
			pageContext.getOut().print(theSpeechReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

