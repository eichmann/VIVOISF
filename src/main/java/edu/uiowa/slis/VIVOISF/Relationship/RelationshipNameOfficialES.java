package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameOfficialESIterator theRelationship = (RelationshipNameOfficialESIterator)findAncestorWithClass(this, RelationshipNameOfficialESIterator.class);
			pageContext.getOut().print(theRelationship.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

