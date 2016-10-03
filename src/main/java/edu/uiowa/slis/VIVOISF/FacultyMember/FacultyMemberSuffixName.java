package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberSuffixNameIterator theFacultyMember = (FacultyMemberSuffixNameIterator)findAncestorWithClass(this, FacultyMemberSuffixNameIterator.class);
			pageContext.getOut().print(theFacultyMember.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

