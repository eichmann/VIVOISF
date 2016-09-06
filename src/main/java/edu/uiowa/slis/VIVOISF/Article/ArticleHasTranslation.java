package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleHasTranslationIterator theArticleHasTranslationIterator = (ArticleHasTranslationIterator)findAncestorWithClass(this, ArticleHasTranslationIterator.class);
			pageContext.getOut().print(theArticleHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

