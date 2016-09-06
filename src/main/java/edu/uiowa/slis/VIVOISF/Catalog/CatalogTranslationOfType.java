package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogTranslationOfIterator theCatalogTranslationOfIterator = (CatalogTranslationOfIterator)findAncestorWithClass(this, CatalogTranslationOfIterator.class);
			pageContext.getOut().print(theCatalogTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

