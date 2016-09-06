package edu.uiowa.slis.VIVOISF.MemberRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MemberRoleBFO_0000054 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MemberRoleBFO_0000054 currentInstance = null;
	private static final Log log = LogFactory.getLog(MemberRoleBFO_0000054.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MemberRoleBFO_0000054Iterator theMemberRoleBFO_0000054Iterator = (MemberRoleBFO_0000054Iterator)findAncestorWithClass(this, MemberRoleBFO_0000054Iterator.class);
			pageContext.getOut().print(theMemberRoleBFO_0000054Iterator.getBFO_0000054());
		} catch (Exception e) {
			log.error("Can't find enclosing MemberRole for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing MemberRole for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

