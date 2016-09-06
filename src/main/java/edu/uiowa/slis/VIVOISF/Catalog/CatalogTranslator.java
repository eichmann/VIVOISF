package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogTranslatorIterator theCatalogTranslatorIterator = (CatalogTranslatorIterator)findAncestorWithClass(this, CatalogTranslatorIterator.class);
			pageContext.getOut().print(theCatalogTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for translator tag ");
		}
		return SKIP_BODY;
	}
}

