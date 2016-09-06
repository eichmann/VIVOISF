package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Relationship theRelationship = (Relationship)findAncestorWithClass(this, Relationship.class);
			if (!theRelationship.commitNeeded) {
				pageContext.getOut().print(theRelationship.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Relationship theRelationship = (Relationship)findAncestorWithClass(this, Relationship.class);
			return theRelationship.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Relationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Relationship theRelationship = (Relationship)findAncestorWithClass(this, Relationship.class);
			theRelationship.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for label tag ");
		}
	}
}

