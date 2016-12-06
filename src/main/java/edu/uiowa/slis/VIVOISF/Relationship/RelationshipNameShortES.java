package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameShortESIterator theRelationship = (RelationshipNameShortESIterator)findAncestorWithClass(this, RelationshipNameShortESIterator.class);
			pageContext.getOut().print(theRelationship.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

