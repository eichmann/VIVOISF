package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyRO_0000056Iterator theCompanyRO_0000056Iterator = (CompanyRO_0000056Iterator)findAncestorWithClass(this, CompanyRO_0000056Iterator.class);
			pageContext.getOut().print(theCompanyRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

