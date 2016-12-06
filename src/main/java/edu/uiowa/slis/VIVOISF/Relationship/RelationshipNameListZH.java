package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameListZHIterator theRelationship = (RelationshipNameListZHIterator)findAncestorWithClass(this, RelationshipNameListZHIterator.class);
			pageContext.getOut().print(theRelationship.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

