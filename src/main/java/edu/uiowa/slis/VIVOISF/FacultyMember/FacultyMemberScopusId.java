package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberScopusId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberScopusId currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberScopusId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberScopusIdIterator theFacultyMember = (FacultyMemberScopusIdIterator)findAncestorWithClass(this, FacultyMemberScopusIdIterator.class);
			pageContext.getOut().print(theFacultyMember.getScopusId());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for scopusId tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for scopusId tag ");
		}
		return SKIP_BODY;
	}
}

