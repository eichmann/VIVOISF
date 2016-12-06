package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipHasMinLongitudeIterator theRelationship = (RelationshipHasMinLongitudeIterator)findAncestorWithClass(this, RelationshipHasMinLongitudeIterator.class);
			pageContext.getOut().print(theRelationship.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

