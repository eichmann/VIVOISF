package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameOfficialFRIterator theRelationship = (RelationshipNameOfficialFRIterator)findAncestorWithClass(this, RelationshipNameOfficialFRIterator.class);
			pageContext.getOut().print(theRelationship.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

