package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipRO_0000052Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipRO_0000052Type currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipRO_0000052Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipRO_0000052Iterator theRelationshipRO_0000052Iterator = (RelationshipRO_0000052Iterator)findAncestorWithClass(this, RelationshipRO_0000052Iterator.class);
			pageContext.getOut().print(theRelationshipRO_0000052Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

