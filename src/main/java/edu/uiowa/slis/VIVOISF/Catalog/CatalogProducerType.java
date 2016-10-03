package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogProducerIterator theCatalogProducerIterator = (CatalogProducerIterator)findAncestorWithClass(this, CatalogProducerIterator.class);
			pageContext.getOut().print(theCatalogProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for producer tag ");
		}
		return SKIP_BODY;
	}
}

