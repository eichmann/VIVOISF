package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameCurrencyARIterator theArticle = (ArticleNameCurrencyARIterator)findAncestorWithClass(this, ArticleNameCurrencyARIterator.class);
			pageContext.getOut().print(theArticle.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

