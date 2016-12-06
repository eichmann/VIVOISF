package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameListFRIterator theRelationship = (RelationshipNameListFRIterator)findAncestorWithClass(this, RelationshipNameListFRIterator.class);
			pageContext.getOut().print(theRelationship.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

