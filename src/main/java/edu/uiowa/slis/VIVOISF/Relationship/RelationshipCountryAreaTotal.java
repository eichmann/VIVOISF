package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipCountryAreaTotalIterator theRelationship = (RelationshipCountryAreaTotalIterator)findAncestorWithClass(this, RelationshipCountryAreaTotalIterator.class);
			pageContext.getOut().print(theRelationship.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

