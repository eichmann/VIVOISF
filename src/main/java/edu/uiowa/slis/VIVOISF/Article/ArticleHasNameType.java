package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleHasNameIterator theArticleHasNameIterator = (ArticleHasNameIterator)findAncestorWithClass(this, ArticleHasNameIterator.class);
			pageContext.getOut().print(theArticleHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hasName tag ");
		}
		return SKIP_BODY;
	}
}

