package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleAuthorListIterator theArticleAuthorListIterator = (ArticleAuthorListIterator)findAncestorWithClass(this, ArticleAuthorListIterator.class);
			pageContext.getOut().print(theArticleAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for authorList tag ");
		}
		return SKIP_BODY;
	}
}

