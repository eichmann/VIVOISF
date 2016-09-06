package edu.uiowa.slis.VIVOISF.AttendingProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AttendingProcessBFO_0000055Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AttendingProcessBFO_0000055Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AttendingProcessBFO_0000055Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AttendingProcessBFO_0000055Iterator theAttendingProcessBFO_0000055Iterator = (AttendingProcessBFO_0000055Iterator)findAncestorWithClass(this, AttendingProcessBFO_0000055Iterator.class);
			pageContext.getOut().print(theAttendingProcessBFO_0000055Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AttendingProcess for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AttendingProcess for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

