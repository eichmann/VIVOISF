package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameOfficialENIterator theRelationship = (RelationshipNameOfficialENIterator)findAncestorWithClass(this, RelationshipNameOfficialENIterator.class);
			pageContext.getOut().print(theRelationship.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

