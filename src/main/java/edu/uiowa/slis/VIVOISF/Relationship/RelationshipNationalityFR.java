package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNationalityFRIterator theRelationship = (RelationshipNationalityFRIterator)findAncestorWithClass(this, RelationshipNationalityFRIterator.class);
			pageContext.getOut().print(theRelationship.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

