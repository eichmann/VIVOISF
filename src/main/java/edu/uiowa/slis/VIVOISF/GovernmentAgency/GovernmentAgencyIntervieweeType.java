package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyIntervieweeIterator theGovernmentAgencyIntervieweeIterator = (GovernmentAgencyIntervieweeIterator)findAncestorWithClass(this, GovernmentAgencyIntervieweeIterator.class);
			pageContext.getOut().print(theGovernmentAgencyIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

