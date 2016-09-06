package edu.uiowa.slis.VIVOISF.TeacherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeacherRoleRoleContributesToType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeacherRoleRoleContributesToType currentInstance = null;
	private static final Log log = LogFactory.getLog(TeacherRoleRoleContributesToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeacherRoleRoleContributesToIterator theTeacherRoleRoleContributesToIterator = (TeacherRoleRoleContributesToIterator)findAncestorWithClass(this, TeacherRoleRoleContributesToIterator.class);
			pageContext.getOut().print(theTeacherRoleRoleContributesToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TeacherRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing TeacherRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

