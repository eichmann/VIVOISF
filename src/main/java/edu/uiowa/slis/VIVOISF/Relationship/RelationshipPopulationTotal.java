package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipPopulationTotalIterator theRelationship = (RelationshipPopulationTotalIterator)findAncestorWithClass(this, RelationshipPopulationTotalIterator.class);
			pageContext.getOut().print(theRelationship.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

