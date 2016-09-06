package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleRelatedByIterator theArticleRelatedByIterator = (ArticleRelatedByIterator)findAncestorWithClass(this, ArticleRelatedByIterator.class);
			pageContext.getOut().print(theArticleRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

