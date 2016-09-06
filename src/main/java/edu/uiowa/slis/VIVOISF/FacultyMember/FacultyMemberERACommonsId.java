package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberERACommonsId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberERACommonsId currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberERACommonsId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberERACommonsIdIterator theFacultyMember = (FacultyMemberERACommonsIdIterator)findAncestorWithClass(this, FacultyMemberERACommonsIdIterator.class);
			pageContext.getOut().print(theFacultyMember.getERACommonsId());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for eRACommonsId tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for eRACommonsId tag ");
		}
		return SKIP_BODY;
	}
}

