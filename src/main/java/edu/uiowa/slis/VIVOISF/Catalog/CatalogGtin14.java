package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogGtin14Iterator theCatalog = (CatalogGtin14Iterator)findAncestorWithClass(this, CatalogGtin14Iterator.class);
			pageContext.getOut().print(theCatalog.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

