package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationShortDescriptionIterator theTranslation = (TranslationShortDescriptionIterator)findAncestorWithClass(this, TranslationShortDescriptionIterator.class);
			pageContext.getOut().print(theTranslation.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

