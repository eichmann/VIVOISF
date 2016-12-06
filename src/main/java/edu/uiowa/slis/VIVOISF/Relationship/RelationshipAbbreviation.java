package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Relationship theRelationship = (Relationship)findAncestorWithClass(this, Relationship.class);
			if (!theRelationship.commitNeeded) {
				pageContext.getOut().print(theRelationship.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Relationship theRelationship = (Relationship)findAncestorWithClass(this, Relationship.class);
			return theRelationship.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Relationship for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Relationship theRelationship = (Relationship)findAncestorWithClass(this, Relationship.class);
			theRelationship.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for abbreviation tag ");
		}
	}
}

