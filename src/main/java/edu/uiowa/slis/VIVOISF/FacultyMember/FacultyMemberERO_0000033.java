package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberERO_0000033 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberERO_0000033 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberERO_0000033.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberERO_0000033Iterator theFacultyMemberERO_0000033Iterator = (FacultyMemberERO_0000033Iterator)findAncestorWithClass(this, FacultyMemberERO_0000033Iterator.class);
			pageContext.getOut().print(theFacultyMemberERO_0000033Iterator.getERO_0000033());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for ERO_0000033 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for ERO_0000033 tag ");
		}
		return SKIP_BODY;
	}
}

