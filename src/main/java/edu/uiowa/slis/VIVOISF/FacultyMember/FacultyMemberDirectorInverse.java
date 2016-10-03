package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberDirectorInverseIterator theFacultyMemberDirectorInverseIterator = (FacultyMemberDirectorInverseIterator)findAncestorWithClass(this, FacultyMemberDirectorInverseIterator.class);
			pageContext.getOut().print(theFacultyMemberDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for director tag ");
		}
		return SKIP_BODY;
	}
}

