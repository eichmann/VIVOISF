package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogEditorListIterator theCatalogEditorListIterator = (CatalogEditorListIterator)findAncestorWithClass(this, CatalogEditorListIterator.class);
			pageContext.getOut().print(theCatalogEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for editorList tag ");
		}
		return SKIP_BODY;
	}
}

