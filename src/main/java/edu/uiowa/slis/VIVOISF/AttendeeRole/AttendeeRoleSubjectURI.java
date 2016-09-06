package edu.uiowa.slis.VIVOISF.AttendeeRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AttendeeRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AttendeeRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AttendeeRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AttendeeRole theAttendeeRole = (AttendeeRole)findAncestorWithClass(this, AttendeeRole.class);
			if (!theAttendeeRole.commitNeeded) {
				pageContext.getOut().print(theAttendeeRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AttendeeRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendeeRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AttendeeRole theAttendeeRole = (AttendeeRole)findAncestorWithClass(this, AttendeeRole.class);
			return theAttendeeRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AttendeeRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendeeRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AttendeeRole theAttendeeRole = (AttendeeRole)findAncestorWithClass(this, AttendeeRole.class);
			theAttendeeRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AttendeeRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendeeRole for subjectURI tag ");
		}
	}
}

