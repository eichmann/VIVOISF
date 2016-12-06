package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameOfficialRUIterator theArticle = (ArticleNameOfficialRUIterator)findAncestorWithClass(this, ArticleNameOfficialRUIterator.class);
			pageContext.getOut().print(theArticle.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

