package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyHasMaxLatitudeIterator theCompany = (CompanyHasMaxLatitudeIterator)findAncestorWithClass(this, CompanyHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theCompany.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

