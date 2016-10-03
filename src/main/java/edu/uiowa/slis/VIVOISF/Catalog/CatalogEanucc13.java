package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogEanucc13Iterator theCatalog = (CatalogEanucc13Iterator)findAncestorWithClass(this, CatalogEanucc13Iterator.class);
			pageContext.getOut().print(theCatalog.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

