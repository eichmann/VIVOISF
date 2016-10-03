package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogContent currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogContentIterator theCatalog = (CatalogContentIterator)findAncestorWithClass(this, CatalogContentIterator.class);
			pageContext.getOut().print(theCatalog.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for content tag ");
		}
		return SKIP_BODY;
	}
}

