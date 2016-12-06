package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameListESIterator theRelationship = (RelationshipNameListESIterator)findAncestorWithClass(this, RelationshipNameListESIterator.class);
			pageContext.getOut().print(theRelationship.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

