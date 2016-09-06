package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogCitesIterator theCatalogCitesIterator = (CatalogCitesIterator)findAncestorWithClass(this, CatalogCitesIterator.class);
			pageContext.getOut().print(theCatalogCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for cites tag ");
		}
		return SKIP_BODY;
	}
}

