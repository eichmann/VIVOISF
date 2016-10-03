package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyInterviewerInverseIterator thePrivateCompanyInterviewerInverseIterator = (PrivateCompanyInterviewerInverseIterator)findAncestorWithClass(this, PrivateCompanyInterviewerInverseIterator.class);
			pageContext.getOut().print(thePrivateCompanyInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

