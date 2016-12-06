package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipRelatedByIterator theRelationshipRelatedByIterator = (RelationshipRelatedByIterator)findAncestorWithClass(this, RelationshipRelatedByIterator.class);
			pageContext.getOut().print(theRelationshipRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

