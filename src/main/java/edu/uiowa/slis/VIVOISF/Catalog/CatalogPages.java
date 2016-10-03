package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogPages currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogPagesIterator theCatalog = (CatalogPagesIterator)findAncestorWithClass(this, CatalogPagesIterator.class);
			pageContext.getOut().print(theCatalog.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for pages tag ");
		}
		return SKIP_BODY;
	}
}

