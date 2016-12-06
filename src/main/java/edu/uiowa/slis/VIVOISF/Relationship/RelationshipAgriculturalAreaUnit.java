package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipAgriculturalAreaUnitIterator theRelationship = (RelationshipAgriculturalAreaUnitIterator)findAncestorWithClass(this, RelationshipAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theRelationship.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

