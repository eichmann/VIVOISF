package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleRank currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleRankIterator theArticle = (ArticleRankIterator)findAncestorWithClass(this, ArticleRankIterator.class);
			pageContext.getOut().print(theArticle.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for rank tag ");
		}
		return SKIP_BODY;
	}
}

