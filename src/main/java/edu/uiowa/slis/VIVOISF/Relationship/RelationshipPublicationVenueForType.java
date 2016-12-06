package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipPublicationVenueForIterator theRelationshipPublicationVenueForIterator = (RelationshipPublicationVenueForIterator)findAncestorWithClass(this, RelationshipPublicationVenueForIterator.class);
			pageContext.getOut().print(theRelationshipPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

