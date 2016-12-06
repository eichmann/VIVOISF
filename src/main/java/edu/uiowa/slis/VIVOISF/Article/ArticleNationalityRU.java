package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNationalityRUIterator theArticle = (ArticleNationalityRUIterator)findAncestorWithClass(this, ArticleNationalityRUIterator.class);
			pageContext.getOut().print(theArticle.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

