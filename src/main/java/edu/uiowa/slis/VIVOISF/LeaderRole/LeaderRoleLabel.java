package edu.uiowa.slis.VIVOISF.LeaderRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LeaderRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LeaderRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LeaderRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LeaderRole theLeaderRole = (LeaderRole)findAncestorWithClass(this, LeaderRole.class);
			if (!theLeaderRole.commitNeeded) {
				pageContext.getOut().print(theLeaderRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LeaderRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LeaderRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			LeaderRole theLeaderRole = (LeaderRole)findAncestorWithClass(this, LeaderRole.class);
			return theLeaderRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing LeaderRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LeaderRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			LeaderRole theLeaderRole = (LeaderRole)findAncestorWithClass(this, LeaderRole.class);
			theLeaderRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing LeaderRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LeaderRole for label tag ");
		}
	}
}

