package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogReviewOfIterator theCatalogReviewOfIterator = (CatalogReviewOfIterator)findAncestorWithClass(this, CatalogReviewOfIterator.class);
			pageContext.getOut().print(theCatalogReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

