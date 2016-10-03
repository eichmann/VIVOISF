package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationSection currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TranslationSectionIterator theTranslation = (TranslationSectionIterator)findAncestorWithClass(this, TranslationSectionIterator.class);
			pageContext.getOut().print(theTranslation.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for section tag ");
		}
		return SKIP_BODY;
	}
}

