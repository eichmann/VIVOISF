package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipRO_0002353Iterator theRelationshipRO_0002353Iterator = (RelationshipRO_0002353Iterator)findAncestorWithClass(this, RelationshipRO_0002353Iterator.class);
			pageContext.getOut().print(theRelationshipRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

