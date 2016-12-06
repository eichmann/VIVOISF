package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyRO_0002234Iterator theCompanyRO_0002234Iterator = (CompanyRO_0002234Iterator)findAncestorWithClass(this, CompanyRO_0002234Iterator.class);
			pageContext.getOut().print(theCompanyRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

