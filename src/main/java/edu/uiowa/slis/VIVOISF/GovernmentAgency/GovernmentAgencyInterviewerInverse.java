package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyInterviewerInverseIterator theGovernmentAgencyInterviewerInverseIterator = (GovernmentAgencyInterviewerInverseIterator)findAncestorWithClass(this, GovernmentAgencyInterviewerInverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

