package edu.uiowa.slis.VIVOISF.AttendeeRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AttendeeRoleBFO_0000054 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AttendeeRoleBFO_0000054 currentInstance = null;
	private static final Log log = LogFactory.getLog(AttendeeRoleBFO_0000054.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AttendeeRoleBFO_0000054Iterator theAttendeeRoleBFO_0000054Iterator = (AttendeeRoleBFO_0000054Iterator)findAncestorWithClass(this, AttendeeRoleBFO_0000054Iterator.class);
			pageContext.getOut().print(theAttendeeRoleBFO_0000054Iterator.getBFO_0000054());
		} catch (Exception e) {
			log.error("Can't find enclosing AttendeeRole for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendeeRole for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

