package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticlePopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticlePopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticlePopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticlePopulationUnitIterator theArticle = (ArticlePopulationUnitIterator)findAncestorWithClass(this, ArticlePopulationUnitIterator.class);
			pageContext.getOut().print(theArticle.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

