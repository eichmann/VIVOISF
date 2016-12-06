package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleHDIYearIterator theArticle = (ArticleHDIYearIterator)findAncestorWithClass(this, ArticleHDIYearIterator.class);
			pageContext.getOut().print(theArticle.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

