package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogUri currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogUriIterator theCatalog = (CatalogUriIterator)findAncestorWithClass(this, CatalogUriIterator.class);
			pageContext.getOut().print(theCatalog.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for uri tag ");
		}
		return SKIP_BODY;
	}
}

