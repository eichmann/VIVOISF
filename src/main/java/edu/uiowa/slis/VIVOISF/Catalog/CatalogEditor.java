package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogEditorIterator theCatalogEditorIterator = (CatalogEditorIterator)findAncestorWithClass(this, CatalogEditorIterator.class);
			pageContext.getOut().print(theCatalogEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for editor tag ");
		}
		return SKIP_BODY;
	}
}

