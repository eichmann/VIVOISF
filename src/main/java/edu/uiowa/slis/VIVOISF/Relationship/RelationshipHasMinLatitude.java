package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipHasMinLatitudeIterator theRelationship = (RelationshipHasMinLatitudeIterator)findAncestorWithClass(this, RelationshipHasMinLatitudeIterator.class);
			pageContext.getOut().print(theRelationship.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

