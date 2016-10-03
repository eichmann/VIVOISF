package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyPrefixNameIterator theCompany = (CompanyPrefixNameIterator)findAncestorWithClass(this, CompanyPrefixNameIterator.class);
			pageContext.getOut().print(theCompany.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

