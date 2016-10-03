package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogShortDescriptionIterator theCatalog = (CatalogShortDescriptionIterator)findAncestorWithClass(this, CatalogShortDescriptionIterator.class);
			pageContext.getOut().print(theCatalog.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

