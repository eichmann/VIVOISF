package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyERO_0001520 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyERO_0001520 currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyERO_0001520.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyERO_0001520Iterator theCompanyERO_0001520Iterator = (CompanyERO_0001520Iterator)findAncestorWithClass(this, CompanyERO_0001520Iterator.class);
			pageContext.getOut().print(theCompanyERO_0001520Iterator.getERO_0001520());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

