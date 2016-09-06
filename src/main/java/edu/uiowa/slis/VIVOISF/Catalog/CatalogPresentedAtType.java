package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogPresentedAtIterator theCatalogPresentedAtIterator = (CatalogPresentedAtIterator)findAncestorWithClass(this, CatalogPresentedAtIterator.class);
			pageContext.getOut().print(theCatalogPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

