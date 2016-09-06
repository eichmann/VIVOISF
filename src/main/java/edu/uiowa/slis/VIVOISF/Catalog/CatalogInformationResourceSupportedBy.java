package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogInformationResourceSupportedByIterator theCatalogInformationResourceSupportedByIterator = (CatalogInformationResourceSupportedByIterator)findAncestorWithClass(this, CatalogInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theCatalogInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

