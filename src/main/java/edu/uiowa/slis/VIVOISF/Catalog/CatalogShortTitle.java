package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogShortTitleIterator theCatalog = (CatalogShortTitleIterator)findAncestorWithClass(this, CatalogShortTitleIterator.class);
			pageContext.getOut().print(theCatalog.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

