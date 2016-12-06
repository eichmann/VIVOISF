package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameOfficialARIterator theCompany = (CompanyNameOfficialARIterator)findAncestorWithClass(this, CompanyNameOfficialARIterator.class);
			pageContext.getOut().print(theCompany.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

