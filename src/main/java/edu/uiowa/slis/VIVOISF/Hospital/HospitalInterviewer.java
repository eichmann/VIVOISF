package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalInterviewerIterator theHospitalInterviewerIterator = (HospitalInterviewerIterator)findAncestorWithClass(this, HospitalInterviewerIterator.class);
			pageContext.getOut().print(theHospitalInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

