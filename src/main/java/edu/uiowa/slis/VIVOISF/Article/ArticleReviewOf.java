package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleReviewOfIterator theArticleReviewOfIterator = (ArticleReviewOfIterator)findAncestorWithClass(this, ArticleReviewOfIterator.class);
			pageContext.getOut().print(theArticleReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

