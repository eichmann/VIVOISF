package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleIsbn10Iterator theArticle = (ArticleIsbn10Iterator)findAncestorWithClass(this, ArticleIsbn10Iterator.class);
			pageContext.getOut().print(theArticle.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

