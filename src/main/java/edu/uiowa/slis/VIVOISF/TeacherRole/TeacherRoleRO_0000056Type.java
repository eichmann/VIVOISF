package edu.uiowa.slis.VIVOISF.TeacherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeacherRoleRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeacherRoleRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(TeacherRoleRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeacherRoleRO_0000056Iterator theTeacherRoleRO_0000056Iterator = (TeacherRoleRO_0000056Iterator)findAncestorWithClass(this, TeacherRoleRO_0000056Iterator.class);
			pageContext.getOut().print(theTeacherRoleRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TeacherRole for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing TeacherRole for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

