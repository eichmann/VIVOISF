package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogHandleIterator theCatalog = (CatalogHandleIterator)findAncestorWithClass(this, CatalogHandleIterator.class);
			pageContext.getOut().print(theCatalog.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for handle tag ");
		}
		return SKIP_BODY;
	}
}

