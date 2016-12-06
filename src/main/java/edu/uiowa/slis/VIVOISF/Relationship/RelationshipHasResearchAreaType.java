package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipHasResearchAreaIterator theRelationshipHasResearchAreaIterator = (RelationshipHasResearchAreaIterator)findAncestorWithClass(this, RelationshipHasResearchAreaIterator.class);
			pageContext.getOut().print(theRelationshipHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

