package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionCodeDBPediaIDIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionCodeDBPediaIDIterator)findAncestorWithClass(this, NonFacultyAcademicPositionCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

