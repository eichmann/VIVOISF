package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleCodeCurrencyIterator theArticle = (ArticleCodeCurrencyIterator)findAncestorWithClass(this, ArticleCodeCurrencyIterator.class);
			pageContext.getOut().print(theArticle.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

