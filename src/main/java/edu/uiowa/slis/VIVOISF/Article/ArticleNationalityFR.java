package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNationalityFRIterator theArticle = (ArticleNationalityFRIterator)findAncestorWithClass(this, ArticleNationalityFRIterator.class);
			pageContext.getOut().print(theArticle.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

