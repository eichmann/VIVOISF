package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNationalityESIterator theArticle = (ArticleNationalityESIterator)findAncestorWithClass(this, ArticleNationalityESIterator.class);
			pageContext.getOut().print(theArticle.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

