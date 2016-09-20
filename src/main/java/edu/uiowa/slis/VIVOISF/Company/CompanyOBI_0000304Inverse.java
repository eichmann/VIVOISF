package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyOBI_0000304Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyOBI_0000304Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyOBI_0000304Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyOBI_0000304InverseIterator theCompanyOBI_0000304InverseIterator = (CompanyOBI_0000304InverseIterator)findAncestorWithClass(this, CompanyOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theCompanyOBI_0000304InverseIterator.getOBI_0000304Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

