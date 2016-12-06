package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticlePublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticlePublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticlePublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticlePublicationVenueForIterator theArticlePublicationVenueForIterator = (ArticlePublicationVenueForIterator)findAncestorWithClass(this, ArticlePublicationVenueForIterator.class);
			pageContext.getOut().print(theArticlePublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}
