package edu.uiowa.slis.VIVOISF.AttendingProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AttendingProcessRO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AttendingProcessRO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(AttendingProcessRO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AttendingProcessRO_0000057Iterator theAttendingProcessRO_0000057Iterator = (AttendingProcessRO_0000057Iterator)findAncestorWithClass(this, AttendingProcessRO_0000057Iterator.class);
			pageContext.getOut().print(theAttendingProcessRO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing AttendingProcess for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendingProcess for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

