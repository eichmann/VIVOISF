package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleEditorListIterator theEditorialArticleEditorListIterator = (EditorialArticleEditorListIterator)findAncestorWithClass(this, EditorialArticleEditorListIterator.class);
			pageContext.getOut().print(theEditorialArticleEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for editorList tag ");
		}
		return SKIP_BODY;
	}
}
