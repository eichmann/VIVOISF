package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameListRUIterator theArticle = (ArticleNameListRUIterator)findAncestorWithClass(this, ArticleNameListRUIterator.class);
			pageContext.getOut().print(theArticle.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

