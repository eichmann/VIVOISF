package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleDoiIterator theArticle = (ArticleDoiIterator)findAncestorWithClass(this, ArticleDoiIterator.class);
			pageContext.getOut().print(theArticle.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for doi tag ");
		}
		return SKIP_BODY;
	}
}

