package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameListRUIterator theRelationship = (RelationshipNameListRUIterator)findAncestorWithClass(this, RelationshipNameListRUIterator.class);
			pageContext.getOut().print(theRelationship.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

