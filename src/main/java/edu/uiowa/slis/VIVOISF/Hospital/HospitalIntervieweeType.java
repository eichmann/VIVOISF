package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalIntervieweeIterator theHospitalIntervieweeIterator = (HospitalIntervieweeIterator)findAncestorWithClass(this, HospitalIntervieweeIterator.class);
			pageContext.getOut().print(theHospitalIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

