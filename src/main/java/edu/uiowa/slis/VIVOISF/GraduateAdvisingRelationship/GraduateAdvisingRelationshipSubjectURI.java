package edu.uiowa.slis.VIVOISF.GraduateAdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateAdvisingRelationshipSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateAdvisingRelationshipSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateAdvisingRelationshipSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GraduateAdvisingRelationship theGraduateAdvisingRelationship = (GraduateAdvisingRelationship)findAncestorWithClass(this, GraduateAdvisingRelationship.class);
			if (!theGraduateAdvisingRelationship.commitNeeded) {
				pageContext.getOut().print(theGraduateAdvisingRelationship.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateAdvisingRelationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateAdvisingRelationship for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			GraduateAdvisingRelationship theGraduateAdvisingRelationship = (GraduateAdvisingRelationship)findAncestorWithClass(this, GraduateAdvisingRelationship.class);
			return theGraduateAdvisingRelationship.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing GraduateAdvisingRelationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateAdvisingRelationship for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			GraduateAdvisingRelationship theGraduateAdvisingRelationship = (GraduateAdvisingRelationship)findAncestorWithClass(this, GraduateAdvisingRelationship.class);
			theGraduateAdvisingRelationship.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateAdvisingRelationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateAdvisingRelationship for subjectURI tag ");
		}
	}
}

