package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameCurrencyRUIterator theArticle = (ArticleNameCurrencyRUIterator)findAncestorWithClass(this, ArticleNameCurrencyRUIterator.class);
			pageContext.getOut().print(theArticle.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

