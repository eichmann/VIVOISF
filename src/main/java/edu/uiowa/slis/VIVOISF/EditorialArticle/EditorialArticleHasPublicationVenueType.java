package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleHasPublicationVenueIterator theEditorialArticleHasPublicationVenueIterator = (EditorialArticleHasPublicationVenueIterator)findAncestorWithClass(this, EditorialArticleHasPublicationVenueIterator.class);
			pageContext.getOut().print(theEditorialArticleHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

