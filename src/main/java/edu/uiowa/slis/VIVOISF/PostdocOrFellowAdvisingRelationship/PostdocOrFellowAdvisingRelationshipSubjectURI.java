package edu.uiowa.slis.VIVOISF.PostdocOrFellowAdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocOrFellowAdvisingRelationshipSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocOrFellowAdvisingRelationshipSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocOrFellowAdvisingRelationshipSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PostdocOrFellowAdvisingRelationship thePostdocOrFellowAdvisingRelationship = (PostdocOrFellowAdvisingRelationship)findAncestorWithClass(this, PostdocOrFellowAdvisingRelationship.class);
			if (!thePostdocOrFellowAdvisingRelationship.commitNeeded) {
				pageContext.getOut().print(thePostdocOrFellowAdvisingRelationship.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocOrFellowAdvisingRelationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocOrFellowAdvisingRelationship for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PostdocOrFellowAdvisingRelationship thePostdocOrFellowAdvisingRelationship = (PostdocOrFellowAdvisingRelationship)findAncestorWithClass(this, PostdocOrFellowAdvisingRelationship.class);
			return thePostdocOrFellowAdvisingRelationship.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PostdocOrFellowAdvisingRelationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocOrFellowAdvisingRelationship for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PostdocOrFellowAdvisingRelationship thePostdocOrFellowAdvisingRelationship = (PostdocOrFellowAdvisingRelationship)findAncestorWithClass(this, PostdocOrFellowAdvisingRelationship.class);
			thePostdocOrFellowAdvisingRelationship.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocOrFellowAdvisingRelationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocOrFellowAdvisingRelationship for subjectURI tag ");
		}
	}
}

