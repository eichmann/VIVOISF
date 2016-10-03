package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleEditorListIterator theArticleEditorListIterator = (ArticleEditorListIterator)findAncestorWithClass(this, ArticleEditorListIterator.class);
			pageContext.getOut().print(theArticleEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for editorList tag ");
		}
		return SKIP_BODY;
	}
}

