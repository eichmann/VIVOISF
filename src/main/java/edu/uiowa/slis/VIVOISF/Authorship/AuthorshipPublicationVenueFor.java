package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipPublicationVenueForIterator theAuthorshipPublicationVenueForIterator = (AuthorshipPublicationVenueForIterator)findAncestorWithClass(this, AuthorshipPublicationVenueForIterator.class);
			pageContext.getOut().print(theAuthorshipPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

