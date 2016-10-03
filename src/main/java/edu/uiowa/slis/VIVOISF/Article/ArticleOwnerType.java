package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleOwnerIterator theArticleOwnerIterator = (ArticleOwnerIterator)findAncestorWithClass(this, ArticleOwnerIterator.class);
			pageContext.getOut().print(theArticleOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for owner tag ");
		}
		return SKIP_BODY;
	}
}

