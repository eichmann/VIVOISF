package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipHDITotalIterator theRelationship = (RelationshipHDITotalIterator)findAncestorWithClass(this, RelationshipHDITotalIterator.class);
			pageContext.getOut().print(theRelationship.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

