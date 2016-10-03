package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyInterviewerInverseIterator theCompanyInterviewerInverseIterator = (CompanyInterviewerInverseIterator)findAncestorWithClass(this, CompanyInterviewerInverseIterator.class);
			pageContext.getOut().print(theCompanyInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

