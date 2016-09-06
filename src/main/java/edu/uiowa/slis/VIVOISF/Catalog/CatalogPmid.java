package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogPmidIterator theCatalog = (CatalogPmidIterator)findAncestorWithClass(this, CatalogPmidIterator.class);
			pageContext.getOut().print(theCatalog.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for pmid tag ");
		}
		return SKIP_BODY;
	}
}

