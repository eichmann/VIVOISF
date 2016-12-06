package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNationalityARIterator theRelationship = (RelationshipNationalityARIterator)findAncestorWithClass(this, RelationshipNationalityARIterator.class);
			pageContext.getOut().print(theRelationship.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

