package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogOwnerIterator theCatalogOwnerIterator = (CatalogOwnerIterator)findAncestorWithClass(this, CatalogOwnerIterator.class);
			pageContext.getOut().print(theCatalogOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for owner tag ");
		}
		return SKIP_BODY;
	}
}

