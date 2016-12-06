package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleHasResearchAreaIterator theArticleHasResearchAreaIterator = (ArticleHasResearchAreaIterator)findAncestorWithClass(this, ArticleHasResearchAreaIterator.class);
			pageContext.getOut().print(theArticleHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

