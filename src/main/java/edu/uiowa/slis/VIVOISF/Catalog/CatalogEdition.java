package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogEditionIterator theCatalog = (CatalogEditionIterator)findAncestorWithClass(this, CatalogEditionIterator.class);
			pageContext.getOut().print(theCatalog.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for edition tag ");
		}
		return SKIP_BODY;
	}
}

