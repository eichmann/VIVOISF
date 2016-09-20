package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberERO_0000397 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberERO_0000397 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberERO_0000397.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberERO_0000397Iterator theFacultyMemberERO_0000397Iterator = (FacultyMemberERO_0000397Iterator)findAncestorWithClass(this, FacultyMemberERO_0000397Iterator.class);
			pageContext.getOut().print(theFacultyMemberERO_0000397Iterator.getERO_0000397());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for ERO_0000397 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for ERO_0000397 tag ");
		}
		return SKIP_BODY;
	}
}

