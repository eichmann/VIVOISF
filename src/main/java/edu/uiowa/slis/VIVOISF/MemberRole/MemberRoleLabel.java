package edu.uiowa.slis.VIVOISF.MemberRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MemberRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MemberRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MemberRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MemberRole theMemberRole = (MemberRole)findAncestorWithClass(this, MemberRole.class);
			if (!theMemberRole.commitNeeded) {
				pageContext.getOut().print(theMemberRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MemberRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MemberRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			MemberRole theMemberRole = (MemberRole)findAncestorWithClass(this, MemberRole.class);
			return theMemberRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing MemberRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MemberRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			MemberRole theMemberRole = (MemberRole)findAncestorWithClass(this, MemberRole.class);
			theMemberRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing MemberRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MemberRole for label tag ");
		}
	}
}

