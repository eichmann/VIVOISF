package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogDocumentationForIterator theCatalogDocumentationForIterator = (CatalogDocumentationForIterator)findAncestorWithClass(this, CatalogDocumentationForIterator.class);
			pageContext.getOut().print(theCatalogDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

