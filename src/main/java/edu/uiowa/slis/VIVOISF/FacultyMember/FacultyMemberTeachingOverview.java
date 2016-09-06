package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberTeachingOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberTeachingOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberTeachingOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			if (!theFacultyMember.commitNeeded) {
				pageContext.getOut().print(theFacultyMember.getTeachingOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for teachingOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getTeachingOverview() throws JspTagException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			return theFacultyMember.getTeachingOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyMember for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for teachingOverview tag ");
		}
	}

	public void setTeachingOverview(String teachingOverview) throws JspTagException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			theFacultyMember.setTeachingOverview(teachingOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for teachingOverview tag ");
		}
	}
}

