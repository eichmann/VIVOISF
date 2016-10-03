package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogCodenIterator theCatalog = (CatalogCodenIterator)findAncestorWithClass(this, CatalogCodenIterator.class);
			pageContext.getOut().print(theCatalog.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for coden tag ");
		}
		return SKIP_BODY;
	}
}

