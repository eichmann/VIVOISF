package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameShortZHIterator theRelationship = (RelationshipNameShortZHIterator)findAncestorWithClass(this, RelationshipNameShortZHIterator.class);
			pageContext.getOut().print(theRelationship.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

