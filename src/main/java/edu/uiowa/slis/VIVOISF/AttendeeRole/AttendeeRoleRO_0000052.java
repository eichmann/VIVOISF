package edu.uiowa.slis.VIVOISF.AttendeeRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AttendeeRoleRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AttendeeRoleRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(AttendeeRoleRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AttendeeRoleRO_0000052Iterator theAttendeeRoleRO_0000052Iterator = (AttendeeRoleRO_0000052Iterator)findAncestorWithClass(this, AttendeeRoleRO_0000052Iterator.class);
			pageContext.getOut().print(theAttendeeRoleRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing AttendeeRole for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendeeRole for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

