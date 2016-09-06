package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentTranslatorIterator theAudioDocumentTranslatorIterator = (AudioDocumentTranslatorIterator)findAncestorWithClass(this, AudioDocumentTranslatorIterator.class);
			pageContext.getOut().print(theAudioDocumentTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for translator tag ");
		}
		return SKIP_BODY;
	}
}

