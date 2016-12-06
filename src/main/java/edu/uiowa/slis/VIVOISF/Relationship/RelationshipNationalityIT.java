package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNationalityITIterator theRelationship = (RelationshipNationalityITIterator)findAncestorWithClass(this, RelationshipNationalityITIterator.class);
			pageContext.getOut().print(theRelationship.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

