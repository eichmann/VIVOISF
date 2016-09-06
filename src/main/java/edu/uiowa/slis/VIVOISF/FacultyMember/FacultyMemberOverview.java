package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			if (!theFacultyMember.commitNeeded) {
				pageContext.getOut().print(theFacultyMember.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			return theFacultyMember.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyMember for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			theFacultyMember.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for overview tag ");
		}
	}
}

