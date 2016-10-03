package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleEditorIterator theEditorialArticleEditorIterator = (EditorialArticleEditorIterator)findAncestorWithClass(this, EditorialArticleEditorIterator.class);
			pageContext.getOut().print(theEditorialArticleEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for editor tag ");
		}
		return SKIP_BODY;
	}
}

