package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameShortARIterator theRelationship = (RelationshipNameShortARIterator)findAncestorWithClass(this, RelationshipNameShortARIterator.class);
			pageContext.getOut().print(theRelationship.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

