package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechDocumentationForIterator theSpeechDocumentationForIterator = (SpeechDocumentationForIterator)findAncestorWithClass(this, SpeechDocumentationForIterator.class);
			pageContext.getOut().print(theSpeechDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

