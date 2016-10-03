package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationContent currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationContentIterator theTranslation = (TranslationContentIterator)findAncestorWithClass(this, TranslationContentIterator.class);
			pageContext.getOut().print(theTranslation.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for content tag ");
		}
		return SKIP_BODY;
	}
}

