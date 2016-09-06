package edu.uiowa.slis.VIVOISF.AttendeeRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AttendeeRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AttendeeRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AttendeeRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AttendeeRole theAttendeeRole = (AttendeeRole)findAncestorWithClass(this, AttendeeRole.class);
			if (!theAttendeeRole.commitNeeded) {
				pageContext.getOut().print(theAttendeeRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AttendeeRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendeeRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AttendeeRole theAttendeeRole = (AttendeeRole)findAncestorWithClass(this, AttendeeRole.class);
			return theAttendeeRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AttendeeRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendeeRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AttendeeRole theAttendeeRole = (AttendeeRole)findAncestorWithClass(this, AttendeeRole.class);
			theAttendeeRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AttendeeRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendeeRole for label tag ");
		}
	}
}

