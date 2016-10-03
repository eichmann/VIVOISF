package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogNumPagesIterator theCatalog = (CatalogNumPagesIterator)findAncestorWithClass(this, CatalogNumPagesIterator.class);
			pageContext.getOut().print(theCatalog.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for numPages tag ");
		}
		return SKIP_BODY;
	}
}

