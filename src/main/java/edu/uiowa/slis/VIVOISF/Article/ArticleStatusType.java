package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleStatusIterator theArticleStatusIterator = (ArticleStatusIterator)findAncestorWithClass(this, ArticleStatusIterator.class);
			pageContext.getOut().print(theArticleStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for status tag ");
		}
		return SKIP_BODY;
	}
}

