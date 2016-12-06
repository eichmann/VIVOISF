package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyRO_0001015Iterator theCompanyRO_0001015Iterator = (CompanyRO_0001015Iterator)findAncestorWithClass(this, CompanyRO_0001015Iterator.class);
			pageContext.getOut().print(theCompanyRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}
