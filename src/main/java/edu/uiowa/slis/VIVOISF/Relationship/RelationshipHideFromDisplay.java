package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Relationship theRelationship = (Relationship)findAncestorWithClass(this, Relationship.class);
			if (!theRelationship.commitNeeded) {
				pageContext.getOut().print(theRelationship.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Relationship theRelationship = (Relationship)findAncestorWithClass(this, Relationship.class);
			return theRelationship.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Relationship for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Relationship theRelationship = (Relationship)findAncestorWithClass(this, Relationship.class);
			theRelationship.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for hideFromDisplay tag ");
		}
	}
}

