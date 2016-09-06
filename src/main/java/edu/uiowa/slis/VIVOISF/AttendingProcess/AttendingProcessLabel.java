package edu.uiowa.slis.VIVOISF.AttendingProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AttendingProcessLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AttendingProcessLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AttendingProcessLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AttendingProcess theAttendingProcess = (AttendingProcess)findAncestorWithClass(this, AttendingProcess.class);
			if (!theAttendingProcess.commitNeeded) {
				pageContext.getOut().print(theAttendingProcess.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AttendingProcess for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendingProcess for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AttendingProcess theAttendingProcess = (AttendingProcess)findAncestorWithClass(this, AttendingProcess.class);
			return theAttendingProcess.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AttendingProcess for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendingProcess for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AttendingProcess theAttendingProcess = (AttendingProcess)findAncestorWithClass(this, AttendingProcess.class);
			theAttendingProcess.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AttendingProcess for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendingProcess for label tag ");
		}
	}
}

