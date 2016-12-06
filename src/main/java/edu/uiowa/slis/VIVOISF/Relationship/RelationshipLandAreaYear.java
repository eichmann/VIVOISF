package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipLandAreaYearIterator theRelationship = (RelationshipLandAreaYearIterator)findAncestorWithClass(this, RelationshipLandAreaYearIterator.class);
			pageContext.getOut().print(theRelationship.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

