package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipRO_0000056Iterator theRelationshipRO_0000056Iterator = (RelationshipRO_0000056Iterator)findAncestorWithClass(this, RelationshipRO_0000056Iterator.class);
			pageContext.getOut().print(theRelationshipRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

