package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNationalityRUIterator theRelationship = (RelationshipNationalityRUIterator)findAncestorWithClass(this, RelationshipNationalityRUIterator.class);
			pageContext.getOut().print(theRelationship.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

