package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameCurrencyESIterator theArticle = (ArticleNameCurrencyESIterator)findAncestorWithClass(this, ArticleNameCurrencyESIterator.class);
			pageContext.getOut().print(theArticle.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

