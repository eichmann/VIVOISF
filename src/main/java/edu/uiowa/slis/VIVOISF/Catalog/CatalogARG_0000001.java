package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogARG_0000001Iterator theCatalog = (CatalogARG_0000001Iterator)findAncestorWithClass(this, CatalogARG_0000001Iterator.class);
			pageContext.getOut().print(theCatalog.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

