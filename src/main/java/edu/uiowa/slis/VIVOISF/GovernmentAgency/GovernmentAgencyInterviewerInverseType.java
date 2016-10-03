package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyInterviewerInverseIterator theGovernmentAgencyInterviewerInverseIterator = (GovernmentAgencyInterviewerInverseIterator)findAncestorWithClass(this, GovernmentAgencyInterviewerInverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

