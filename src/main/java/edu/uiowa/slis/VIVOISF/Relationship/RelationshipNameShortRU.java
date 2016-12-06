package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameShortRUIterator theRelationship = (RelationshipNameShortRUIterator)findAncestorWithClass(this, RelationshipNameShortRUIterator.class);
			pageContext.getOut().print(theRelationship.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

