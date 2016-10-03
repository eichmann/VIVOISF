package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleContributorListIterator theArticleContributorListIterator = (ArticleContributorListIterator)findAncestorWithClass(this, ArticleContributorListIterator.class);
			pageContext.getOut().print(theArticleContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

