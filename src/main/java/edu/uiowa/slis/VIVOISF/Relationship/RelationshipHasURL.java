package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipHasURLIterator theRelationshipHasURLIterator = (RelationshipHasURLIterator)findAncestorWithClass(this, RelationshipHasURLIterator.class);
			pageContext.getOut().print(theRelationshipHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

