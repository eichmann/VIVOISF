package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationCodenIterator theTranslation = (TranslationCodenIterator)findAncestorWithClass(this, TranslationCodenIterator.class);
			pageContext.getOut().print(theTranslation.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for coden tag ");
		}
		return SKIP_BODY;
	}
}

