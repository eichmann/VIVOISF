package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogDistributorIterator theCatalogDistributorIterator = (CatalogDistributorIterator)findAncestorWithClass(this, CatalogDistributorIterator.class);
			pageContext.getOut().print(theCatalogDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for distributor tag ");
		}
		return SKIP_BODY;
	}
}

