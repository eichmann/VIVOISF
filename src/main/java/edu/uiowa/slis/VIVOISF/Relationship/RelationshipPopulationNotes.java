package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipPopulationNotesIterator theRelationship = (RelationshipPopulationNotesIterator)findAncestorWithClass(this, RelationshipPopulationNotesIterator.class);
			pageContext.getOut().print(theRelationship.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

