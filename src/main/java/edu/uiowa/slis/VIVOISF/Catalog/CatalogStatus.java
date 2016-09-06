package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogStatusIterator theCatalogStatusIterator = (CatalogStatusIterator)findAncestorWithClass(this, CatalogStatusIterator.class);
			pageContext.getOut().print(theCatalogStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for status tag ");
		}
		return SKIP_BODY;
	}
}

