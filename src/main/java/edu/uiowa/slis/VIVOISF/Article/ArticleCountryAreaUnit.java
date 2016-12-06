package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleCountryAreaUnitIterator theArticle = (ArticleCountryAreaUnitIterator)findAncestorWithClass(this, ArticleCountryAreaUnitIterator.class);
			pageContext.getOut().print(theArticle.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

