package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipCountryAreaYearIterator theRelationship = (RelationshipCountryAreaYearIterator)findAncestorWithClass(this, RelationshipCountryAreaYearIterator.class);
			pageContext.getOut().print(theRelationship.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

