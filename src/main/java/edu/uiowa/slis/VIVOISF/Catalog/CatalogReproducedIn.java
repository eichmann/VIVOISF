package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogReproducedInIterator theCatalogReproducedInIterator = (CatalogReproducedInIterator)findAncestorWithClass(this, CatalogReproducedInIterator.class);
			pageContext.getOut().print(theCatalogReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

