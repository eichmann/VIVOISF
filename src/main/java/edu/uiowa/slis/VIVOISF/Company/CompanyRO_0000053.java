package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyRO_0000053Iterator theCompanyRO_0000053Iterator = (CompanyRO_0000053Iterator)findAncestorWithClass(this, CompanyRO_0000053Iterator.class);
			pageContext.getOut().print(theCompanyRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

