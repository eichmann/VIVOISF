package edu.uiowa.slis.VIVOISF.AttendeeRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AttendeeRoleRoleContributesToType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AttendeeRoleRoleContributesToType currentInstance = null;
	private static final Log log = LogFactory.getLog(AttendeeRoleRoleContributesToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AttendeeRoleRoleContributesToIterator theAttendeeRoleRoleContributesToIterator = (AttendeeRoleRoleContributesToIterator)findAncestorWithClass(this, AttendeeRoleRoleContributesToIterator.class);
			pageContext.getOut().print(theAttendeeRoleRoleContributesToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AttendeeRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendeeRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

