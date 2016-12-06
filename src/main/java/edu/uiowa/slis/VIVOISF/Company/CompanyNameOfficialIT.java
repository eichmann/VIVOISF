package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameOfficialITIterator theCompany = (CompanyNameOfficialITIterator)findAncestorWithClass(this, CompanyNameOfficialITIterator.class);
			pageContext.getOut().print(theCompany.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

