package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleFreetextKeywordIterator theArticle = (ArticleFreetextKeywordIterator)findAncestorWithClass(this, ArticleFreetextKeywordIterator.class);
			pageContext.getOut().print(theArticle.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

