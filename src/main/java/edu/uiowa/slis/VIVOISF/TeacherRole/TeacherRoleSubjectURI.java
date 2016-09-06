package edu.uiowa.slis.VIVOISF.TeacherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeacherRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeacherRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TeacherRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TeacherRole theTeacherRole = (TeacherRole)findAncestorWithClass(this, TeacherRole.class);
			if (!theTeacherRole.commitNeeded) {
				pageContext.getOut().print(theTeacherRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TeacherRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TeacherRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			TeacherRole theTeacherRole = (TeacherRole)findAncestorWithClass(this, TeacherRole.class);
			return theTeacherRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing TeacherRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TeacherRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			TeacherRole theTeacherRole = (TeacherRole)findAncestorWithClass(this, TeacherRole.class);
			theTeacherRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing TeacherRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TeacherRole for subjectURI tag ");
		}
	}
}

