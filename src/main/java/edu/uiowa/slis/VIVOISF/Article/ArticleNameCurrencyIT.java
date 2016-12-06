package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameCurrencyITIterator theArticle = (ArticleNameCurrencyITIterator)findAncestorWithClass(this, ArticleNameCurrencyITIterator.class);
			pageContext.getOut().print(theArticle.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

