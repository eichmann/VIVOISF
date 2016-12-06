package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonHasPublicationVenueIterator thePersonHasPublicationVenueIterator = (PersonHasPublicationVenueIterator)findAncestorWithClass(this, PersonHasPublicationVenueIterator.class);
			pageContext.getOut().print(thePersonHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

