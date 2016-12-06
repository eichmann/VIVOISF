package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleHasMaxLatitudeIterator theArticle = (ArticleHasMaxLatitudeIterator)findAncestorWithClass(this, ArticleHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theArticle.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

