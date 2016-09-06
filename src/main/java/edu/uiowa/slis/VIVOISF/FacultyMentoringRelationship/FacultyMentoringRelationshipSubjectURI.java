package edu.uiowa.slis.VIVOISF.FacultyMentoringRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMentoringRelationshipSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMentoringRelationshipSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMentoringRelationshipSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMentoringRelationship theFacultyMentoringRelationship = (FacultyMentoringRelationship)findAncestorWithClass(this, FacultyMentoringRelationship.class);
			if (!theFacultyMentoringRelationship.commitNeeded) {
				pageContext.getOut().print(theFacultyMentoringRelationship.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMentoringRelationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMentoringRelationship for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			FacultyMentoringRelationship theFacultyMentoringRelationship = (FacultyMentoringRelationship)findAncestorWithClass(this, FacultyMentoringRelationship.class);
			return theFacultyMentoringRelationship.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyMentoringRelationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMentoringRelationship for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			FacultyMentoringRelationship theFacultyMentoringRelationship = (FacultyMentoringRelationship)findAncestorWithClass(this, FacultyMentoringRelationship.class);
			theFacultyMentoringRelationship.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMentoringRelationship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMentoringRelationship for subjectURI tag ");
		}
	}
}

