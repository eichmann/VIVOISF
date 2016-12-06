package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyRO_0001025Iterator theCompanyRO_0001025Iterator = (CompanyRO_0001025Iterator)findAncestorWithClass(this, CompanyRO_0001025Iterator.class);
			pageContext.getOut().print(theCompanyRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

