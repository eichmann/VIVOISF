package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNationalityENIterator theRelationship = (RelationshipNationalityENIterator)findAncestorWithClass(this, RelationshipNationalityENIterator.class);
			pageContext.getOut().print(theRelationship.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

