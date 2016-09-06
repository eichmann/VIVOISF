package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogRO_0000056Iterator theCatalogRO_0000056Iterator = (CatalogRO_0000056Iterator)findAncestorWithClass(this, CatalogRO_0000056Iterator.class);
			pageContext.getOut().print(theCatalogRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

