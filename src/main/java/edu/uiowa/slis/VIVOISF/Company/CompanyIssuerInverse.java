package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyIssuerInverseIterator theCompanyIssuerInverseIterator = (CompanyIssuerInverseIterator)findAncestorWithClass(this, CompanyIssuerInverseIterator.class);
			pageContext.getOut().print(theCompanyIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for issuer tag ");
		}
		return SKIP_BODY;
	}
}

