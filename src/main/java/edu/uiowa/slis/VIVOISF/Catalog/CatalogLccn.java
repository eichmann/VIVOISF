package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogLccnIterator theCatalog = (CatalogLccnIterator)findAncestorWithClass(this, CatalogLccnIterator.class);
			pageContext.getOut().print(theCatalog.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for lccn tag ");
		}
		return SKIP_BODY;
	}
}

