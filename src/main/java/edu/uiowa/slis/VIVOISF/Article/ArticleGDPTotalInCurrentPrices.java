package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleGDPTotalInCurrentPricesIterator theArticle = (ArticleGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, ArticleGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theArticle.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

