package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipCountryAreaUnitIterator theRelationship = (RelationshipCountryAreaUnitIterator)findAncestorWithClass(this, RelationshipCountryAreaUnitIterator.class);
			pageContext.getOut().print(theRelationship.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

