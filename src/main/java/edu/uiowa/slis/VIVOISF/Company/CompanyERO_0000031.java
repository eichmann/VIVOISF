package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyERO_0000031 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyERO_0000031 currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyERO_0000031.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyERO_0000031Iterator theCompanyERO_0000031Iterator = (CompanyERO_0000031Iterator)findAncestorWithClass(this, CompanyERO_0000031Iterator.class);
			pageContext.getOut().print(theCompanyERO_0000031Iterator.getERO_0000031());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

