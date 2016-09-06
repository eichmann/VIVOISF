package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyGoverningAuthorityForIterator theCompanyGoverningAuthorityForIterator = (CompanyGoverningAuthorityForIterator)findAncestorWithClass(this, CompanyGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theCompanyGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

