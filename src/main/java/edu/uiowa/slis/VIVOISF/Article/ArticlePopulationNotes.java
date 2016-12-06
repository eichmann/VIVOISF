package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticlePopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticlePopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticlePopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticlePopulationNotesIterator theArticle = (ArticlePopulationNotesIterator)findAncestorWithClass(this, ArticlePopulationNotesIterator.class);
			pageContext.getOut().print(theArticle.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

