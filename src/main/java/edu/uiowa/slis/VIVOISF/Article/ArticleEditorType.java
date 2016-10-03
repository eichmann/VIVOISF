package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleEditorIterator theArticleEditorIterator = (ArticleEditorIterator)findAncestorWithClass(this, ArticleEditorIterator.class);
			pageContext.getOut().print(theArticleEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for editor tag ");
		}
		return SKIP_BODY;
	}
}

