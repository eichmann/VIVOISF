package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameListESIterator theArticle = (ArticleNameListESIterator)findAncestorWithClass(this, ArticleNameListESIterator.class);
			pageContext.getOut().print(theArticle.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

