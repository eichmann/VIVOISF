package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleIsbn13Iterator theArticle = (ArticleIsbn13Iterator)findAncestorWithClass(this, ArticleIsbn13Iterator.class);
			pageContext.getOut().print(theArticle.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

