package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogAuthorListIterator theCatalogAuthorListIterator = (CatalogAuthorListIterator)findAncestorWithClass(this, CatalogAuthorListIterator.class);
			pageContext.getOut().print(theCatalogAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for authorList tag ");
		}
		return SKIP_BODY;
	}
}

