package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipBFO_0000050Iterator theRelationshipBFO_0000050Iterator = (RelationshipBFO_0000050Iterator)findAncestorWithClass(this, RelationshipBFO_0000050Iterator.class);
			pageContext.getOut().print(theRelationshipBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

