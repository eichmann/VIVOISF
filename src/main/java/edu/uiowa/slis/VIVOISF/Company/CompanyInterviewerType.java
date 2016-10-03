package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyInterviewerIterator theCompanyInterviewerIterator = (CompanyInterviewerIterator)findAncestorWithClass(this, CompanyInterviewerIterator.class);
			pageContext.getOut().print(theCompanyInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

