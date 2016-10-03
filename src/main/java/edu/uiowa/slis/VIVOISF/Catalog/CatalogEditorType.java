package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogEditorIterator theCatalogEditorIterator = (CatalogEditorIterator)findAncestorWithClass(this, CatalogEditorIterator.class);
			pageContext.getOut().print(theCatalogEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for editor tag ");
		}
		return SKIP_BODY;
	}
}

