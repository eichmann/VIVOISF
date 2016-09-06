package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogIAO_0000136Iterator theCatalogIAO_0000136Iterator = (CatalogIAO_0000136Iterator)findAncestorWithClass(this, CatalogIAO_0000136Iterator.class);
			pageContext.getOut().print(theCatalogIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

