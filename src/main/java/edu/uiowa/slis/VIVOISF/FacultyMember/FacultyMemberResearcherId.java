package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberResearcherId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberResearcherId currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberResearcherId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberResearcherIdIterator theFacultyMember = (FacultyMemberResearcherIdIterator)findAncestorWithClass(this, FacultyMemberResearcherIdIterator.class);
			pageContext.getOut().print(theFacultyMember.getResearcherId());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for researcherId tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for researcherId tag ");
		}
		return SKIP_BODY;
	}
}

