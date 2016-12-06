package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyHDITotalIterator theCompany = (CompanyHDITotalIterator)findAncestorWithClass(this, CompanyHDITotalIterator.class);
			pageContext.getOut().print(theCompany.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

