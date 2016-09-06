package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationCitesIterator theTranslationCitesIterator = (TranslationCitesIterator)findAncestorWithClass(this, TranslationCitesIterator.class);
			pageContext.getOut().print(theTranslationCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for cites tag ");
		}
		return SKIP_BODY;
	}
}

