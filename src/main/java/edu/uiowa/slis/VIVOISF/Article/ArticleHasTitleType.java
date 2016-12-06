package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleHasTitleIterator theArticleHasTitleIterator = (ArticleHasTitleIterator)findAncestorWithClass(this, ArticleHasTitleIterator.class);
			pageContext.getOut().print(theArticleHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

