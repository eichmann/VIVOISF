package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogSici currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogSiciIterator theCatalog = (CatalogSiciIterator)findAncestorWithClass(this, CatalogSiciIterator.class);
			pageContext.getOut().print(theCatalog.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for sici tag ");
		}
		return SKIP_BODY;
	}
}

