package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameShortRUIterator theArticle = (ArticleNameShortRUIterator)findAncestorWithClass(this, ArticleNameShortRUIterator.class);
			pageContext.getOut().print(theArticle.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

