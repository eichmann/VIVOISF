package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberERO_0000037 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberERO_0000037 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberERO_0000037.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberERO_0000037Iterator theFacultyMemberERO_0000037Iterator = (FacultyMemberERO_0000037Iterator)findAncestorWithClass(this, FacultyMemberERO_0000037Iterator.class);
			pageContext.getOut().print(theFacultyMemberERO_0000037Iterator.getERO_0000037());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

