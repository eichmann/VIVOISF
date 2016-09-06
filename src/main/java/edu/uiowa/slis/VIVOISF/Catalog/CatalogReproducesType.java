package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogReproducesIterator theCatalogReproducesIterator = (CatalogReproducesIterator)findAncestorWithClass(this, CatalogReproducesIterator.class);
			pageContext.getOut().print(theCatalogReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

