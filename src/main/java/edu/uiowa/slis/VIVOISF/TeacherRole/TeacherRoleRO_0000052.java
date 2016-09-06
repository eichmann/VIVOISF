package edu.uiowa.slis.VIVOISF.TeacherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeacherRoleRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeacherRoleRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(TeacherRoleRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeacherRoleRO_0000052Iterator theTeacherRoleRO_0000052Iterator = (TeacherRoleRO_0000052Iterator)findAncestorWithClass(this, TeacherRoleRO_0000052Iterator.class);
			pageContext.getOut().print(theTeacherRoleRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing TeacherRole for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing TeacherRole for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

