package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipHasPublicationVenueIterator theAuthorshipHasPublicationVenueIterator = (AuthorshipHasPublicationVenueIterator)findAncestorWithClass(this, AuthorshipHasPublicationVenueIterator.class);
			pageContext.getOut().print(theAuthorshipHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

