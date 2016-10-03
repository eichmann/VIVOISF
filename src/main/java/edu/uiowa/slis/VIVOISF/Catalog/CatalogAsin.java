package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogAsinIterator theCatalog = (CatalogAsinIterator)findAncestorWithClass(this, CatalogAsinIterator.class);
			pageContext.getOut().print(theCatalog.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for asin tag ");
		}
		return SKIP_BODY;
	}
}

