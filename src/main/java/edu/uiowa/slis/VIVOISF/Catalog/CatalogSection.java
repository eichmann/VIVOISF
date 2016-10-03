package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogSection currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogSectionIterator theCatalog = (CatalogSectionIterator)findAncestorWithClass(this, CatalogSectionIterator.class);
			pageContext.getOut().print(theCatalog.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for section tag ");
		}
		return SKIP_BODY;
	}
}

