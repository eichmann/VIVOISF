package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Relationship theRelationship = (Relationship)findAncestorWithClass(this, Relationship.class);
			if (!theRelationship.commitNeeded) {
				pageContext.getOut().print(theRelationship.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Relationship theRelationship = (Relationship)findAncestorWithClass(this, Relationship.class);
			return theRelationship.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Relationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Relationship theRelationship = (Relationship)findAncestorWithClass(this, Relationship.class);
			theRelationship.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for subjectURI tag ");
		}
	}
}

