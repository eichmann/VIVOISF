package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupPublicationVenueForIterator thespecial_groupPublicationVenueForIterator = (special_groupPublicationVenueForIterator)findAncestorWithClass(this, special_groupPublicationVenueForIterator.class);
			pageContext.getOut().print(thespecial_groupPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

