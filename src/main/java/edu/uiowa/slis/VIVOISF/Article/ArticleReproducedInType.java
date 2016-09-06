package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleReproducedInIterator theArticleReproducedInIterator = (ArticleReproducedInIterator)findAncestorWithClass(this, ArticleReproducedInIterator.class);
			pageContext.getOut().print(theArticleReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

