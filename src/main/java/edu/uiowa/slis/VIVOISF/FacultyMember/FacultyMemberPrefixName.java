package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberPrefixNameIterator theFacultyMember = (FacultyMemberPrefixNameIterator)findAncestorWithClass(this, FacultyMemberPrefixNameIterator.class);
			pageContext.getOut().print(theFacultyMember.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

