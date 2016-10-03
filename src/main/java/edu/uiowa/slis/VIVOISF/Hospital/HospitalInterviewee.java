package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalIntervieweeIterator theHospitalIntervieweeIterator = (HospitalIntervieweeIterator)findAncestorWithClass(this, HospitalIntervieweeIterator.class);
			pageContext.getOut().print(theHospitalIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

