package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipAgriculturalAreaNotesIterator theRelationship = (RelationshipAgriculturalAreaNotesIterator)findAncestorWithClass(this, RelationshipAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theRelationship.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

