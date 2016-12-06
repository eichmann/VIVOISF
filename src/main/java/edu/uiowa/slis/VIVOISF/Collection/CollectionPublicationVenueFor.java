package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionPublicationVenueForIterator theCollectionPublicationVenueForIterator = (CollectionPublicationVenueForIterator)findAncestorWithClass(this, CollectionPublicationVenueForIterator.class);
			pageContext.getOut().print(theCollectionPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

