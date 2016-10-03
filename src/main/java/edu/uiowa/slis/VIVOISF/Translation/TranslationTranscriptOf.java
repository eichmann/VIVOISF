package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationTranscriptOfIterator theTranslationTranscriptOfIterator = (TranslationTranscriptOfIterator)findAncestorWithClass(this, TranslationTranscriptOfIterator.class);
			pageContext.getOut().print(theTranslationTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

