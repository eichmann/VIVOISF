package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyRO_0002353Iterator theCompanyRO_0002353Iterator = (CompanyRO_0002353Iterator)findAncestorWithClass(this, CompanyRO_0002353Iterator.class);
			pageContext.getOut().print(theCompanyRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

