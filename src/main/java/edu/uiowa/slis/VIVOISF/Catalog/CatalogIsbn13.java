package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogIsbn13Iterator theCatalog = (CatalogIsbn13Iterator)findAncestorWithClass(this, CatalogIsbn13Iterator.class);
			pageContext.getOut().print(theCatalog.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

