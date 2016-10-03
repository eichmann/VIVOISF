package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyIntervieweeInverseIterator theGovernmentAgencyIntervieweeInverseIterator = (GovernmentAgencyIntervieweeInverseIterator)findAncestorWithClass(this, GovernmentAgencyIntervieweeInverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

