package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyCodeFAOSTATIterator theCompany = (CompanyCodeFAOSTATIterator)findAncestorWithClass(this, CompanyCodeFAOSTATIterator.class);
			pageContext.getOut().print(theCompany.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

