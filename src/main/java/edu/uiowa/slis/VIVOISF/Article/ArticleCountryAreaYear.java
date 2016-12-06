package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleCountryAreaYearIterator theArticle = (ArticleCountryAreaYearIterator)findAncestorWithClass(this, ArticleCountryAreaYearIterator.class);
			pageContext.getOut().print(theArticle.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

