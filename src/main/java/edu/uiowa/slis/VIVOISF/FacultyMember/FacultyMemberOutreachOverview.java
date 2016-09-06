package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberOutreachOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberOutreachOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberOutreachOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			if (!theFacultyMember.commitNeeded) {
				pageContext.getOut().print(theFacultyMember.getOutreachOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for outreachOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getOutreachOverview() throws JspTagException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			return theFacultyMember.getOutreachOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyMember for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for outreachOverview tag ");
		}
	}

	public void setOutreachOverview(String outreachOverview) throws JspTagException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			theFacultyMember.setOutreachOverview(outreachOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for outreachOverview tag ");
		}
	}
}

