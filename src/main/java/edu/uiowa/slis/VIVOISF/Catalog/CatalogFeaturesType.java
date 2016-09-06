package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogFeaturesIterator theCatalogFeaturesIterator = (CatalogFeaturesIterator)findAncestorWithClass(this, CatalogFeaturesIterator.class);
			pageContext.getOut().print(theCatalogFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for features tag ");
		}
		return SKIP_BODY;
	}
}

