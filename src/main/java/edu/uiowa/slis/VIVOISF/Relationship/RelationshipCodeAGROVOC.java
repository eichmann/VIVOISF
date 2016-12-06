package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipCodeAGROVOCIterator theRelationship = (RelationshipCodeAGROVOCIterator)findAncestorWithClass(this, RelationshipCodeAGROVOCIterator.class);
			pageContext.getOut().print(theRelationship.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

