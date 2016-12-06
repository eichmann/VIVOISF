package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipPopulationYearIterator theRelationship = (RelationshipPopulationYearIterator)findAncestorWithClass(this, RelationshipPopulationYearIterator.class);
			pageContext.getOut().print(theRelationship.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

