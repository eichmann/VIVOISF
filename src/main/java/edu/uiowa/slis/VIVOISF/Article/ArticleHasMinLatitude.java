package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleHasMinLatitudeIterator theArticle = (ArticleHasMinLatitudeIterator)findAncestorWithClass(this, ArticleHasMinLatitudeIterator.class);
			pageContext.getOut().print(theArticle.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

