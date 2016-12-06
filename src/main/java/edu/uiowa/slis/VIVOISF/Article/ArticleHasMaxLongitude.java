package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleHasMaxLongitudeIterator theArticle = (ArticleHasMaxLongitudeIterator)findAncestorWithClass(this, ArticleHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theArticle.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

