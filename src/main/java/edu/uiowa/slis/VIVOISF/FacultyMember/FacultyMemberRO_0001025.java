package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberRO_0001025.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberRO_0001025Iterator theFacultyMember = (FacultyMemberRO_0001025Iterator)findAncestorWithClass(this, FacultyMemberRO_0001025Iterator.class);
			pageContext.getOut().print(theFacultyMember.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

