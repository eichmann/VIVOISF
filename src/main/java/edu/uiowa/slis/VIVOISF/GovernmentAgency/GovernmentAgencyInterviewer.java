package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyInterviewerIterator theGovernmentAgencyInterviewerIterator = (GovernmentAgencyInterviewerIterator)findAncestorWithClass(this, GovernmentAgencyInterviewerIterator.class);
			pageContext.getOut().print(theGovernmentAgencyInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

