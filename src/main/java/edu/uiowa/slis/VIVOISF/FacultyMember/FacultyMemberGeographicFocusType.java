package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberGeographicFocusIterator theFacultyMemberGeographicFocusIterator = (FacultyMemberGeographicFocusIterator)findAncestorWithClass(this, FacultyMemberGeographicFocusIterator.class);
			pageContext.getOut().print(theFacultyMemberGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

