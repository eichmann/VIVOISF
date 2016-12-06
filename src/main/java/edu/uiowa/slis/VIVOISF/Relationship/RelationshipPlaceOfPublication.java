package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Relationship theRelationship = (Relationship)findAncestorWithClass(this, Relationship.class);
			if (!theRelationship.commitNeeded) {
				pageContext.getOut().print(theRelationship.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Relationship theRelationship = (Relationship)findAncestorWithClass(this, Relationship.class);
			return theRelationship.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Relationship for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Relationship theRelationship = (Relationship)findAncestorWithClass(this, Relationship.class);
			theRelationship.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for placeOfPublication tag ");
		}
	}
}

