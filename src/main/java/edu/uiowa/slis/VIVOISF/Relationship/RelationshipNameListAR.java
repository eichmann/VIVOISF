package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameListARIterator theRelationship = (RelationshipNameListARIterator)findAncestorWithClass(this, RelationshipNameListARIterator.class);
			pageContext.getOut().print(theRelationship.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

