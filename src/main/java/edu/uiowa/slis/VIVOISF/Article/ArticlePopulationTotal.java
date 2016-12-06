package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticlePopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticlePopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticlePopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticlePopulationTotalIterator theArticle = (ArticlePopulationTotalIterator)findAncestorWithClass(this, ArticlePopulationTotalIterator.class);
			pageContext.getOut().print(theArticle.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

