package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyCodeISO3Iterator theCompany = (CompanyCodeISO3Iterator)findAncestorWithClass(this, CompanyCodeISO3Iterator.class);
			pageContext.getOut().print(theCompany.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

