package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyIntervieweeIterator theGovernmentAgencyIntervieweeIterator = (GovernmentAgencyIntervieweeIterator)findAncestorWithClass(this, GovernmentAgencyIntervieweeIterator.class);
			pageContext.getOut().print(theGovernmentAgencyIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

