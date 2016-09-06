package edu.uiowa.slis.VIVOISF.FacultyMentoringRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMentoringRelationshipLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMentoringRelationshipLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMentoringRelationshipLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMentoringRelationship theFacultyMentoringRelationship = (FacultyMentoringRelationship)findAncestorWithClass(this, FacultyMentoringRelationship.class);
			if (!theFacultyMentoringRelationship.commitNeeded) {
				pageContext.getOut().print(theFacultyMentoringRelationship.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMentoringRelationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMentoringRelationship for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			FacultyMentoringRelationship theFacultyMentoringRelationship = (FacultyMentoringRelationship)findAncestorWithClass(this, FacultyMentoringRelationship.class);
			return theFacultyMentoringRelationship.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyMentoringRelationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMentoringRelationship for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			FacultyMentoringRelationship theFacultyMentoringRelationship = (FacultyMentoringRelationship)findAncestorWithClass(this, FacultyMentoringRelationship.class);
			theFacultyMentoringRelationship.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMentoringRelationship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMentoringRelationship for label tag ");
		}
	}
}

