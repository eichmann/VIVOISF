package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipGDPUnitIterator theRelationship = (RelationshipGDPUnitIterator)findAncestorWithClass(this, RelationshipGDPUnitIterator.class);
			pageContext.getOut().print(theRelationship.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

