package edu.uiowa.slis.VIVOISF.AttendingProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AttendingProcessSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AttendingProcessSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AttendingProcessSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AttendingProcess theAttendingProcess = (AttendingProcess)findAncestorWithClass(this, AttendingProcess.class);
			if (!theAttendingProcess.commitNeeded) {
				pageContext.getOut().print(theAttendingProcess.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AttendingProcess for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendingProcess for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AttendingProcess theAttendingProcess = (AttendingProcess)findAncestorWithClass(this, AttendingProcess.class);
			return theAttendingProcess.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AttendingProcess for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendingProcess for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AttendingProcess theAttendingProcess = (AttendingProcess)findAncestorWithClass(this, AttendingProcess.class);
			theAttendingProcess.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AttendingProcess for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendingProcess for subjectURI tag ");
		}
	}
}

