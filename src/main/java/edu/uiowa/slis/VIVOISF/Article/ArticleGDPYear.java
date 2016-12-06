package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleGDPYearIterator theArticle = (ArticleGDPYearIterator)findAncestorWithClass(this, ArticleGDPYearIterator.class);
			pageContext.getOut().print(theArticle.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}
