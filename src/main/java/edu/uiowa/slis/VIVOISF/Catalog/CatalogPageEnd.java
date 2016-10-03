package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogPageEndIterator theCatalog = (CatalogPageEndIterator)findAncestorWithClass(this, CatalogPageEndIterator.class);
			pageContext.getOut().print(theCatalog.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

