package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameCurrencyZHIterator theArticle = (ArticleNameCurrencyZHIterator)findAncestorWithClass(this, ArticleNameCurrencyZHIterator.class);
			pageContext.getOut().print(theArticle.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

