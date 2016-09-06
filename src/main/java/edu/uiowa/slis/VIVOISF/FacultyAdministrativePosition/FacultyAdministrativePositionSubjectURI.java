package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePosition theFacultyAdministrativePosition = (FacultyAdministrativePosition)findAncestorWithClass(this, FacultyAdministrativePosition.class);
			if (!theFacultyAdministrativePosition.commitNeeded) {
				pageContext.getOut().print(theFacultyAdministrativePosition.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			FacultyAdministrativePosition theFacultyAdministrativePosition = (FacultyAdministrativePosition)findAncestorWithClass(this, FacultyAdministrativePosition.class);
			return theFacultyAdministrativePosition.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyAdministrativePosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			FacultyAdministrativePosition theFacultyAdministrativePosition = (FacultyAdministrativePosition)findAncestorWithClass(this, FacultyAdministrativePosition.class);
			theFacultyAdministrativePosition.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for subjectURI tag ");
		}
	}
}

