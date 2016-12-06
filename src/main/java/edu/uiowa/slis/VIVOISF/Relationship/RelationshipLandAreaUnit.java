package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipLandAreaUnitIterator theRelationship = (RelationshipLandAreaUnitIterator)findAncestorWithClass(this, RelationshipLandAreaUnitIterator.class);
			pageContext.getOut().print(theRelationship.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

