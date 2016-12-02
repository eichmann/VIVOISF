package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberOrcidId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberOrcidId currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberOrcidId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberOrcidIdIterator theFacultyMember = (FacultyMemberOrcidIdIterator)findAncestorWithClass(this, FacultyMemberOrcidIdIterator.class);
			pageContext.getOut().print(theFacultyMember.getOrcidId());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

