package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipHasResearchAreaIterator theRelationshipHasResearchAreaIterator = (RelationshipHasResearchAreaIterator)findAncestorWithClass(this, RelationshipHasResearchAreaIterator.class);
			pageContext.getOut().print(theRelationshipHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

