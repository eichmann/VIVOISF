package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogIssuerIterator theCatalogIssuerIterator = (CatalogIssuerIterator)findAncestorWithClass(this, CatalogIssuerIterator.class);
			pageContext.getOut().print(theCatalogIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for issuer tag ");
		}
		return SKIP_BODY;
	}
}

