package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogOclcnumIterator theCatalog = (CatalogOclcnumIterator)findAncestorWithClass(this, CatalogOclcnumIterator.class);
			pageContext.getOut().print(theCatalog.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

