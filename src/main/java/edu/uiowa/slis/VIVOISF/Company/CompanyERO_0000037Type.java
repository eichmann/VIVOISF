package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyERO_0000037Iterator theCompanyERO_0000037Iterator = (CompanyERO_0000037Iterator)findAncestorWithClass(this, CompanyERO_0000037Iterator.class);
			pageContext.getOut().print(theCompanyERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

