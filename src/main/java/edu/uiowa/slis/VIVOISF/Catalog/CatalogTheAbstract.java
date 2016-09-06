package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogTheAbstractIterator theCatalog = (CatalogTheAbstractIterator)findAncestorWithClass(this, CatalogTheAbstractIterator.class);
			pageContext.getOut().print(theCatalog.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

