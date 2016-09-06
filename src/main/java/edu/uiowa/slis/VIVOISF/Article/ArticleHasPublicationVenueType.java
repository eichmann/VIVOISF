package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleHasPublicationVenueIterator theArticleHasPublicationVenueIterator = (ArticleHasPublicationVenueIterator)findAncestorWithClass(this, ArticleHasPublicationVenueIterator.class);
			pageContext.getOut().print(theArticleHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

