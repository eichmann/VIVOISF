package edu.uiowa.slis.VIVOISF.AttendeeRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AttendeeRoleRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AttendeeRoleRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(AttendeeRoleRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AttendeeRoleRO_0000056Iterator theAttendeeRoleRO_0000056Iterator = (AttendeeRoleRO_0000056Iterator)findAncestorWithClass(this, AttendeeRoleRO_0000056Iterator.class);
			pageContext.getOut().print(theAttendeeRoleRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing AttendeeRole for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendeeRole for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

