package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNationalityARIterator theArticle = (ArticleNationalityARIterator)findAncestorWithClass(this, ArticleNationalityARIterator.class);
			pageContext.getOut().print(theArticle.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

