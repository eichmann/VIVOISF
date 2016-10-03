package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalIntervieweeInverseIterator theHospitalIntervieweeInverseIterator = (HospitalIntervieweeInverseIterator)findAncestorWithClass(this, HospitalIntervieweeInverseIterator.class);
			pageContext.getOut().print(theHospitalIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

