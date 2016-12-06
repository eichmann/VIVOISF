package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipDescriptionIterator theRelationship = (RelationshipDescriptionIterator)findAncestorWithClass(this, RelationshipDescriptionIterator.class);
			pageContext.getOut().print(theRelationship.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for description tag ");
		}
		return SKIP_BODY;
	}
}

