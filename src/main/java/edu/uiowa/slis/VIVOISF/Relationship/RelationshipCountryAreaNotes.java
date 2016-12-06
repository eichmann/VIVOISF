package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipCountryAreaNotesIterator theRelationship = (RelationshipCountryAreaNotesIterator)findAncestorWithClass(this, RelationshipCountryAreaNotesIterator.class);
			pageContext.getOut().print(theRelationship.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

