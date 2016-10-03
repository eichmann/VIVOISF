package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogPageStartIterator theCatalog = (CatalogPageStartIterator)findAncestorWithClass(this, CatalogPageStartIterator.class);
			pageContext.getOut().print(theCatalog.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

