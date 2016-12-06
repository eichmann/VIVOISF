package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipHasPublicationVenueIterator theRelationshipHasPublicationVenueIterator = (RelationshipHasPublicationVenueIterator)findAncestorWithClass(this, RelationshipHasPublicationVenueIterator.class);
			pageContext.getOut().print(theRelationshipHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

