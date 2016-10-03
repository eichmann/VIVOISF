package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberOwnerInverseIterator theFacultyMemberOwnerInverseIterator = (FacultyMemberOwnerInverseIterator)findAncestorWithClass(this, FacultyMemberOwnerInverseIterator.class);
			pageContext.getOut().print(theFacultyMemberOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for owner tag ");
		}
		return SKIP_BODY;
	}
}

