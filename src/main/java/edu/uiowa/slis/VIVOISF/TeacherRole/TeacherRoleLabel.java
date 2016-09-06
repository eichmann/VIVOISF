package edu.uiowa.slis.VIVOISF.TeacherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeacherRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeacherRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TeacherRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TeacherRole theTeacherRole = (TeacherRole)findAncestorWithClass(this, TeacherRole.class);
			if (!theTeacherRole.commitNeeded) {
				pageContext.getOut().print(theTeacherRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TeacherRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TeacherRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			TeacherRole theTeacherRole = (TeacherRole)findAncestorWithClass(this, TeacherRole.class);
			return theTeacherRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing TeacherRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TeacherRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			TeacherRole theTeacherRole = (TeacherRole)findAncestorWithClass(this, TeacherRole.class);
			theTeacherRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing TeacherRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TeacherRole for label tag ");
		}
	}
}

