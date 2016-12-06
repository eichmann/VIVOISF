package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(groupPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupPublicationVenueForIterator thegroupPublicationVenueForIterator = (groupPublicationVenueForIterator)findAncestorWithClass(this, groupPublicationVenueForIterator.class);
			pageContext.getOut().print(thegroupPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing group for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

