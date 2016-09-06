package edu.uiowa.slis.VIVOISF.AttendeeRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AttendeeRoleRoleContributesTo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AttendeeRoleRoleContributesTo currentInstance = null;
	private static final Log log = LogFactory.getLog(AttendeeRoleRoleContributesTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AttendeeRoleRoleContributesToIterator theAttendeeRoleRoleContributesToIterator = (AttendeeRoleRoleContributesToIterator)findAncestorWithClass(this, AttendeeRoleRoleContributesToIterator.class);
			pageContext.getOut().print(theAttendeeRoleRoleContributesToIterator.getRoleContributesTo());
		} catch (Exception e) {
			log.error("Can't find enclosing AttendeeRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendeeRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

