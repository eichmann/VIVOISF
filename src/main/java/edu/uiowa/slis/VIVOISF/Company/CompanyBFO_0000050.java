package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyBFO_0000050Iterator theCompanyBFO_0000050Iterator = (CompanyBFO_0000050Iterator)findAncestorWithClass(this, CompanyBFO_0000050Iterator.class);
			pageContext.getOut().print(theCompanyBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

