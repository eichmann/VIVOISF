package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogNumberIterator theCatalog = (CatalogNumberIterator)findAncestorWithClass(this, CatalogNumberIterator.class);
			pageContext.getOut().print(theCatalog.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for number tag ");
		}
		return SKIP_BODY;
	}
}

