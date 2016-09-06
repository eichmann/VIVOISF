package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberResearchOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberResearchOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberResearchOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			if (!theFacultyMember.commitNeeded) {
				pageContext.getOut().print(theFacultyMember.getResearchOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for researchOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getResearchOverview() throws JspTagException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			return theFacultyMember.getResearchOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyMember for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for researchOverview tag ");
		}
	}

	public void setResearchOverview(String researchOverview) throws JspTagException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			theFacultyMember.setResearchOverview(researchOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for researchOverview tag ");
		}
	}
}

