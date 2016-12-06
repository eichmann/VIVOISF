package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyDateTimeValueIterator theCompanyDateTimeValueIterator = (CompanyDateTimeValueIterator)findAncestorWithClass(this, CompanyDateTimeValueIterator.class);
			pageContext.getOut().print(theCompanyDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}
