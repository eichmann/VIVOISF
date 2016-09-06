package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationCitedByIterator theTranslationCitedByIterator = (TranslationCitedByIterator)findAncestorWithClass(this, TranslationCitedByIterator.class);
			pageContext.getOut().print(theTranslationCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

