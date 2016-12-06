package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupHasPublicationVenueIterator thegroupHasPublicationVenueIterator = (groupHasPublicationVenueIterator)findAncestorWithClass(this, groupHasPublicationVenueIterator.class);
			pageContext.getOut().print(thegroupHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

