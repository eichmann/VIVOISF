package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleHandleIterator theArticle = (ArticleHandleIterator)findAncestorWithClass(this, ArticleHandleIterator.class);
			pageContext.getOut().print(theArticle.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for handle tag ");
		}
		return SKIP_BODY;
	}
}

