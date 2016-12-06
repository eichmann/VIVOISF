package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNationalityENIterator theArticle = (ArticleNationalityENIterator)findAncestorWithClass(this, ArticleNationalityENIterator.class);
			pageContext.getOut().print(theArticle.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

