package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNationalityZHIterator theRelationship = (RelationshipNationalityZHIterator)findAncestorWithClass(this, RelationshipNationalityZHIterator.class);
			pageContext.getOut().print(theRelationship.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

