package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleIdentifierIterator theArticle = (ArticleIdentifierIterator)findAncestorWithClass(this, ArticleIdentifierIterator.class);
			pageContext.getOut().print(theArticle.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for identifier tag ");
		}
		return SKIP_BODY;
	}
}

