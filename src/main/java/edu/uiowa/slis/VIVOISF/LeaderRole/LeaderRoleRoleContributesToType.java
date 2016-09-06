package edu.uiowa.slis.VIVOISF.LeaderRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LeaderRoleRoleContributesToType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LeaderRoleRoleContributesToType currentInstance = null;
	private static final Log log = LogFactory.getLog(LeaderRoleRoleContributesToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LeaderRoleRoleContributesToIterator theLeaderRoleRoleContributesToIterator = (LeaderRoleRoleContributesToIterator)findAncestorWithClass(this, LeaderRoleRoleContributesToIterator.class);
			pageContext.getOut().print(theLeaderRoleRoleContributesToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LeaderRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing LeaderRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

