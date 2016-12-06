package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyHasNameIterator theCompanyHasNameIterator = (CompanyHasNameIterator)findAncestorWithClass(this, CompanyHasNameIterator.class);
			pageContext.getOut().print(theCompanyHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasName tag ");
		}
		return SKIP_BODY;
	}
}

