package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyOwnerInverseIterator theCompanyOwnerInverseIterator = (CompanyOwnerInverseIterator)findAncestorWithClass(this, CompanyOwnerInverseIterator.class);
			pageContext.getOut().print(theCompanyOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for owner tag ");
		}
		return SKIP_BODY;
	}
}

