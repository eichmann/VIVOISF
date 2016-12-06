package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleCountryAreaTotalIterator theArticle = (ArticleCountryAreaTotalIterator)findAncestorWithClass(this, ArticleCountryAreaTotalIterator.class);
			pageContext.getOut().print(theArticle.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

