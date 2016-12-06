package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleHasMinLongitudeIterator theArticle = (ArticleHasMinLongitudeIterator)findAncestorWithClass(this, ArticleHasMinLongitudeIterator.class);
			pageContext.getOut().print(theArticle.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

