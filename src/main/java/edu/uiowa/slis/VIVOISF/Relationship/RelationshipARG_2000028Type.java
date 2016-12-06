package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipARG_2000028Iterator theRelationshipARG_2000028Iterator = (RelationshipARG_2000028Iterator)findAncestorWithClass(this, RelationshipARG_2000028Iterator.class);
			pageContext.getOut().print(theRelationshipARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

