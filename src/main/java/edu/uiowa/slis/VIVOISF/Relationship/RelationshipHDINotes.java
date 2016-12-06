package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipHDINotesIterator theRelationship = (RelationshipHDINotesIterator)findAncestorWithClass(this, RelationshipHDINotesIterator.class);
			pageContext.getOut().print(theRelationship.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

