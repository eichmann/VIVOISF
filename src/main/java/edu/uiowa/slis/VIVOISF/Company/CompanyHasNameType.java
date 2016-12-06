package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyHasNameIterator theCompanyHasNameIterator = (CompanyHasNameIterator)findAncestorWithClass(this, CompanyHasNameIterator.class);
			pageContext.getOut().print(theCompanyHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasName tag ");
		}
		return SKIP_BODY;
	}
}

