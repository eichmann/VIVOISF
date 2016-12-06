package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNationalityZHIterator theArticle = (ArticleNationalityZHIterator)findAncestorWithClass(this, ArticleNationalityZHIterator.class);
			pageContext.getOut().print(theArticle.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

