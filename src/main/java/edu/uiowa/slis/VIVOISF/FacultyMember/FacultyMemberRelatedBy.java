package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberRelatedByIterator theFacultyMemberRelatedByIterator = (FacultyMemberRelatedByIterator)findAncestorWithClass(this, FacultyMemberRelatedByIterator.class);
			pageContext.getOut().print(theFacultyMemberRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

