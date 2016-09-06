package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogHasTranslationIterator theCatalogHasTranslationIterator = (CatalogHasTranslationIterator)findAncestorWithClass(this, CatalogHasTranslationIterator.class);
			pageContext.getOut().print(theCatalogHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

