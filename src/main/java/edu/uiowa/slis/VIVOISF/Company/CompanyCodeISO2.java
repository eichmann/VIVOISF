package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyCodeISO2Iterator theCompany = (CompanyCodeISO2Iterator)findAncestorWithClass(this, CompanyCodeISO2Iterator.class);
			pageContext.getOut().print(theCompany.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

