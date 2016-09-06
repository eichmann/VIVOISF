package edu.uiowa.slis.VIVOISF.TeacherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeacherRoleBFO_0000054 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeacherRoleBFO_0000054 currentInstance = null;
	private static final Log log = LogFactory.getLog(TeacherRoleBFO_0000054.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeacherRoleBFO_0000054Iterator theTeacherRoleBFO_0000054Iterator = (TeacherRoleBFO_0000054Iterator)findAncestorWithClass(this, TeacherRoleBFO_0000054Iterator.class);
			pageContext.getOut().print(theTeacherRoleBFO_0000054Iterator.getBFO_0000054());
		} catch (Exception e) {
			log.error("Can't find enclosing TeacherRole for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing TeacherRole for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

