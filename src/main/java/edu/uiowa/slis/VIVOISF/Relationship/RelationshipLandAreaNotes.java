package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipLandAreaNotesIterator theRelationship = (RelationshipLandAreaNotesIterator)findAncestorWithClass(this, RelationshipLandAreaNotesIterator.class);
			pageContext.getOut().print(theRelationship.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

