package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipCodeDBPediaIDIterator theRelationship = (RelationshipCodeDBPediaIDIterator)findAncestorWithClass(this, RelationshipCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theRelationship.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

