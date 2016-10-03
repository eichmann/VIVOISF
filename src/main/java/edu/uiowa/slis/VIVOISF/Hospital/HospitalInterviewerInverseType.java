package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalInterviewerInverseIterator theHospitalInterviewerInverseIterator = (HospitalInterviewerInverseIterator)findAncestorWithClass(this, HospitalInterviewerInverseIterator.class);
			pageContext.getOut().print(theHospitalInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

