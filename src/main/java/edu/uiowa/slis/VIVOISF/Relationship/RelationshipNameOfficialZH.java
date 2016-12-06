package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameOfficialZHIterator theRelationship = (RelationshipNameOfficialZHIterator)findAncestorWithClass(this, RelationshipNameOfficialZHIterator.class);
			pageContext.getOut().print(theRelationship.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

