package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameCurrencyFRIterator theArticle = (ArticleNameCurrencyFRIterator)findAncestorWithClass(this, ArticleNameCurrencyFRIterator.class);
			pageContext.getOut().print(theArticle.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

