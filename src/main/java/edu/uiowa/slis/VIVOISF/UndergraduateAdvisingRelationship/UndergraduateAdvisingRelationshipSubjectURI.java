package edu.uiowa.slis.VIVOISF.UndergraduateAdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateAdvisingRelationshipSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateAdvisingRelationshipSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateAdvisingRelationshipSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			UndergraduateAdvisingRelationship theUndergraduateAdvisingRelationship = (UndergraduateAdvisingRelationship)findAncestorWithClass(this, UndergraduateAdvisingRelationship.class);
			if (!theUndergraduateAdvisingRelationship.commitNeeded) {
				pageContext.getOut().print(theUndergraduateAdvisingRelationship.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateAdvisingRelationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateAdvisingRelationship for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			UndergraduateAdvisingRelationship theUndergraduateAdvisingRelationship = (UndergraduateAdvisingRelationship)findAncestorWithClass(this, UndergraduateAdvisingRelationship.class);
			return theUndergraduateAdvisingRelationship.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing UndergraduateAdvisingRelationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateAdvisingRelationship for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			UndergraduateAdvisingRelationship theUndergraduateAdvisingRelationship = (UndergraduateAdvisingRelationship)findAncestorWithClass(this, UndergraduateAdvisingRelationship.class);
			theUndergraduateAdvisingRelationship.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateAdvisingRelationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateAdvisingRelationship for subjectURI tag ");
		}
	}
}

