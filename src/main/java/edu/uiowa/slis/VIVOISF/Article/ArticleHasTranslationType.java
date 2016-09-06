package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleHasTranslationIterator theArticleHasTranslationIterator = (ArticleHasTranslationIterator)findAncestorWithClass(this, ArticleHasTranslationIterator.class);
			pageContext.getOut().print(theArticleHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

