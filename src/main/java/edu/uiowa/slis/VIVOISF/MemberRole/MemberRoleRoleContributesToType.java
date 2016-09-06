package edu.uiowa.slis.VIVOISF.MemberRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MemberRoleRoleContributesToType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MemberRoleRoleContributesToType currentInstance = null;
	private static final Log log = LogFactory.getLog(MemberRoleRoleContributesToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MemberRoleRoleContributesToIterator theMemberRoleRoleContributesToIterator = (MemberRoleRoleContributesToIterator)findAncestorWithClass(this, MemberRoleRoleContributesToIterator.class);
			pageContext.getOut().print(theMemberRoleRoleContributesToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MemberRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing MemberRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

