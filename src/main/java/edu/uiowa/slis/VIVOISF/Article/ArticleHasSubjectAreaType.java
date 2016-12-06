package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleHasSubjectAreaIterator theArticleHasSubjectAreaIterator = (ArticleHasSubjectAreaIterator)findAncestorWithClass(this, ArticleHasSubjectAreaIterator.class);
			pageContext.getOut().print(theArticleHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

