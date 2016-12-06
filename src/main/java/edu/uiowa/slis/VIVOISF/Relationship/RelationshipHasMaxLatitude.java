package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipHasMaxLatitudeIterator theRelationship = (RelationshipHasMaxLatitudeIterator)findAncestorWithClass(this, RelationshipHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theRelationship.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

