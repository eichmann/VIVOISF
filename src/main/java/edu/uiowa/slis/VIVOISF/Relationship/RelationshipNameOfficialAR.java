package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameOfficialARIterator theRelationship = (RelationshipNameOfficialARIterator)findAncestorWithClass(this, RelationshipNameOfficialARIterator.class);
			pageContext.getOut().print(theRelationship.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

