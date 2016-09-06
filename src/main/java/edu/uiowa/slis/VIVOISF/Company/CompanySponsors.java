package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanySponsors extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanySponsors currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanySponsors.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanySponsorsIterator theCompanySponsorsIterator = (CompanySponsorsIterator)findAncestorWithClass(this, CompanySponsorsIterator.class);
			pageContext.getOut().print(theCompanySponsorsIterator.getSponsors());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

