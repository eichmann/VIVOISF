package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberARG_0000197 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberARG_0000197 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberARG_0000197.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberARG_0000197Iterator theFacultyMember = (FacultyMemberARG_0000197Iterator)findAncestorWithClass(this, FacultyMemberARG_0000197Iterator.class);
			pageContext.getOut().print(theFacultyMember.getARG_0000197());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for ARG_0000197 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for ARG_0000197 tag ");
		}
		return SKIP_BODY;
	}
}

