package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyCourtInverseIterator theCompanyCourtInverseIterator = (CompanyCourtInverseIterator)findAncestorWithClass(this, CompanyCourtInverseIterator.class);
			pageContext.getOut().print(theCompanyCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for court tag ");
		}
		return SKIP_BODY;
	}
}

