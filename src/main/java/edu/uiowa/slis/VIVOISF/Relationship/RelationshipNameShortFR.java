package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameShortFRIterator theRelationship = (RelationshipNameShortFRIterator)findAncestorWithClass(this, RelationshipNameShortFRIterator.class);
			pageContext.getOut().print(theRelationship.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

