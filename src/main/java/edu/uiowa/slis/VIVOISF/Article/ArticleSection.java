package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleSection currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleSectionIterator theArticle = (ArticleSectionIterator)findAncestorWithClass(this, ArticleSectionIterator.class);
			pageContext.getOut().print(theArticle.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for section tag ");
		}
		return SKIP_BODY;
	}
}

