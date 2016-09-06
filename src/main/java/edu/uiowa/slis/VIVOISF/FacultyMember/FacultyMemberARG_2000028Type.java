package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberARG_2000028Iterator theFacultyMemberARG_2000028Iterator = (FacultyMemberARG_2000028Iterator)findAncestorWithClass(this, FacultyMemberARG_2000028Iterator.class);
			pageContext.getOut().print(theFacultyMemberARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

