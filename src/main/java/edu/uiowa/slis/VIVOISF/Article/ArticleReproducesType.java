package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleReproducesIterator theArticleReproducesIterator = (ArticleReproducesIterator)findAncestorWithClass(this, ArticleReproducesIterator.class);
			pageContext.getOut().print(theArticleReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

