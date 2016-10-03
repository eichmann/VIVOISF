package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyIntervieweeInverseIterator theCompanyIntervieweeInverseIterator = (CompanyIntervieweeInverseIterator)findAncestorWithClass(this, CompanyIntervieweeInverseIterator.class);
			pageContext.getOut().print(theCompanyIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

