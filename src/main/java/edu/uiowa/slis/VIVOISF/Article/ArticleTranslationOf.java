package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleTranslationOfIterator theArticleTranslationOfIterator = (ArticleTranslationOfIterator)findAncestorWithClass(this, ArticleTranslationOfIterator.class);
			pageContext.getOut().print(theArticleTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

