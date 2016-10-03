package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyInterviewerIterator thePrivateCompanyInterviewerIterator = (PrivateCompanyInterviewerIterator)findAncestorWithClass(this, PrivateCompanyInterviewerIterator.class);
			pageContext.getOut().print(thePrivateCompanyInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for interviewer tag ");
		}
		return SKIP_BODY;
	}
}
