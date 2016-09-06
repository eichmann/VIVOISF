package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogCitedByIterator theCatalogCitedByIterator = (CatalogCitedByIterator)findAncestorWithClass(this, CatalogCitedByIterator.class);
			pageContext.getOut().print(theCatalogCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

