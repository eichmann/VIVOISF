package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogIsbn10Iterator theCatalog = (CatalogIsbn10Iterator)findAncestorWithClass(this, CatalogIsbn10Iterator.class);
			pageContext.getOut().print(theCatalog.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

