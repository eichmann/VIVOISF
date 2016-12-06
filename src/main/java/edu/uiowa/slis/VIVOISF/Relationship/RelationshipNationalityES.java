package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNationalityESIterator theRelationship = (RelationshipNationalityESIterator)findAncestorWithClass(this, RelationshipNationalityESIterator.class);
			pageContext.getOut().print(theRelationship.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

