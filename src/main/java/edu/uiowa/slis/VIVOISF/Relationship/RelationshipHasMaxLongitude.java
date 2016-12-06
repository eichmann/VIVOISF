package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipHasMaxLongitudeIterator theRelationship = (RelationshipHasMaxLongitudeIterator)findAncestorWithClass(this, RelationshipHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theRelationship.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

