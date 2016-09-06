package edu.uiowa.slis.VIVOISF.MemberRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MemberRoleRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MemberRoleRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(MemberRoleRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MemberRoleRO_0000056Iterator theMemberRoleRO_0000056Iterator = (MemberRoleRO_0000056Iterator)findAncestorWithClass(this, MemberRoleRO_0000056Iterator.class);
			pageContext.getOut().print(theMemberRoleRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MemberRole for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing MemberRole for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

