package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyIntervieweeInverseIterator thePrivateCompanyIntervieweeInverseIterator = (PrivateCompanyIntervieweeInverseIterator)findAncestorWithClass(this, PrivateCompanyIntervieweeInverseIterator.class);
			pageContext.getOut().print(thePrivateCompanyIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

