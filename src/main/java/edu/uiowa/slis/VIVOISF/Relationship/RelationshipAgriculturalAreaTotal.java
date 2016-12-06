package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipAgriculturalAreaTotalIterator theRelationship = (RelationshipAgriculturalAreaTotalIterator)findAncestorWithClass(this, RelationshipAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theRelationship.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

