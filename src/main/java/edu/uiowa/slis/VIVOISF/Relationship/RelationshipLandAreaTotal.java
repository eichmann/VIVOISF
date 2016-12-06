package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipLandAreaTotalIterator theRelationship = (RelationshipLandAreaTotalIterator)findAncestorWithClass(this, RelationshipLandAreaTotalIterator.class);
			pageContext.getOut().print(theRelationship.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

