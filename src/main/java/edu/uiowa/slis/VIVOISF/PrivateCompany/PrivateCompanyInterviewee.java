package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyIntervieweeIterator thePrivateCompanyIntervieweeIterator = (PrivateCompanyIntervieweeIterator)findAncestorWithClass(this, PrivateCompanyIntervieweeIterator.class);
			pageContext.getOut().print(thePrivateCompanyIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

