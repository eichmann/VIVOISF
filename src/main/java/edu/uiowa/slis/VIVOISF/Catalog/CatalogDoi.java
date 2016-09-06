package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogDoiIterator theCatalog = (CatalogDoiIterator)findAncestorWithClass(this, CatalogDoiIterator.class);
			pageContext.getOut().print(theCatalog.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for doi tag ");
		}
		return SKIP_BODY;
	}
}

