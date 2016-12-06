package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipBFO_0000051Iterator theRelationshipBFO_0000051Iterator = (RelationshipBFO_0000051Iterator)findAncestorWithClass(this, RelationshipBFO_0000051Iterator.class);
			pageContext.getOut().print(theRelationshipBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

