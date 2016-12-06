package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyBFO_0000051Iterator theCompanyBFO_0000051Iterator = (CompanyBFO_0000051Iterator)findAncestorWithClass(this, CompanyBFO_0000051Iterator.class);
			pageContext.getOut().print(theCompanyBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

