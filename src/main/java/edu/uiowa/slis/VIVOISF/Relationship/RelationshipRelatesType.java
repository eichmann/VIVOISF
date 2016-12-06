package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipRelatesIterator theRelationshipRelatesIterator = (RelationshipRelatesIterator)findAncestorWithClass(this, RelationshipRelatesIterator.class);
			pageContext.getOut().print(theRelationshipRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for relates tag ");
		}
		return SKIP_BODY;
	}
}

