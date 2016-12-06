package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipCodeUNIterator theRelationship = (RelationshipCodeUNIterator)findAncestorWithClass(this, RelationshipCodeUNIterator.class);
			pageContext.getOut().print(theRelationship.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

