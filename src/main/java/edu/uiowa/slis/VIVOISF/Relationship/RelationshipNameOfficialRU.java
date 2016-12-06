package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameOfficialRUIterator theRelationship = (RelationshipNameOfficialRUIterator)findAncestorWithClass(this, RelationshipNameOfficialRUIterator.class);
			pageContext.getOut().print(theRelationship.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

