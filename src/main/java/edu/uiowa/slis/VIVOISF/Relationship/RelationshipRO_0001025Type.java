package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipRO_0001025Iterator theRelationshipRO_0001025Iterator = (RelationshipRO_0001025Iterator)findAncestorWithClass(this, RelationshipRO_0001025Iterator.class);
			pageContext.getOut().print(theRelationshipRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

