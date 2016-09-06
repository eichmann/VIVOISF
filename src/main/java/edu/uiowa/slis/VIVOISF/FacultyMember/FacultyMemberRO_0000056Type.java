package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberRO_0000056Iterator theFacultyMemberRO_0000056Iterator = (FacultyMemberRO_0000056Iterator)findAncestorWithClass(this, FacultyMemberRO_0000056Iterator.class);
			pageContext.getOut().print(theFacultyMemberRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

