package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogIdentifierIterator theCatalog = (CatalogIdentifierIterator)findAncestorWithClass(this, CatalogIdentifierIterator.class);
			pageContext.getOut().print(theCatalog.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for identifier tag ");
		}
		return SKIP_BODY;
	}
}

