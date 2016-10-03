package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyIntervieweeIterator theCompanyIntervieweeIterator = (CompanyIntervieweeIterator)findAncestorWithClass(this, CompanyIntervieweeIterator.class);
			pageContext.getOut().print(theCompanyIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

