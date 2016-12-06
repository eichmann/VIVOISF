package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipGDPNotesIterator theRelationship = (RelationshipGDPNotesIterator)findAncestorWithClass(this, RelationshipGDPNotesIterator.class);
			pageContext.getOut().print(theRelationship.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

