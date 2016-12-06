package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNationalityITIterator theArticle = (ArticleNationalityITIterator)findAncestorWithClass(this, ArticleNationalityITIterator.class);
			pageContext.getOut().print(theArticle.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

