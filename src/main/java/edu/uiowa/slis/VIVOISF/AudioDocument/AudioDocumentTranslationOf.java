package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentTranslationOfIterator theAudioDocumentTranslationOfIterator = (AudioDocumentTranslationOfIterator)findAncestorWithClass(this, AudioDocumentTranslationOfIterator.class);
			pageContext.getOut().print(theAudioDocumentTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

