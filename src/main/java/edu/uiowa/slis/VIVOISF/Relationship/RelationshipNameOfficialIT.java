package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameOfficialITIterator theRelationship = (RelationshipNameOfficialITIterator)findAncestorWithClass(this, RelationshipNameOfficialITIterator.class);
			pageContext.getOut().print(theRelationship.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

