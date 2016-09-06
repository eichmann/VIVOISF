package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPosition theFacultyPosition = (FacultyPosition)findAncestorWithClass(this, FacultyPosition.class);
			if (!theFacultyPosition.commitNeeded) {
				pageContext.getOut().print(theFacultyPosition.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			FacultyPosition theFacultyPosition = (FacultyPosition)findAncestorWithClass(this, FacultyPosition.class);
			return theFacultyPosition.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			FacultyPosition theFacultyPosition = (FacultyPosition)findAncestorWithClass(this, FacultyPosition.class);
			theFacultyPosition.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for subjectURI tag ");
		}
	}
}

