package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameCurrencyENIterator theArticle = (ArticleNameCurrencyENIterator)findAncestorWithClass(this, ArticleNameCurrencyENIterator.class);
			pageContext.getOut().print(theArticle.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

