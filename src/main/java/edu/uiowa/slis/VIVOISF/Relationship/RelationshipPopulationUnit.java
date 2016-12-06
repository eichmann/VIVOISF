package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipPopulationUnitIterator theRelationship = (RelationshipPopulationUnitIterator)findAncestorWithClass(this, RelationshipPopulationUnitIterator.class);
			pageContext.getOut().print(theRelationship.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

