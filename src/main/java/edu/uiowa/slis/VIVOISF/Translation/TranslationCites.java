package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationCites currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationCitesIterator theTranslationCitesIterator = (TranslationCitesIterator)findAncestorWithClass(this, TranslationCitesIterator.class);
			pageContext.getOut().print(theTranslationCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for cites tag ");
		}
		return SKIP_BODY;
	}
}

