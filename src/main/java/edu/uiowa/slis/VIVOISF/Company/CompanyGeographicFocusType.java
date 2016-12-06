package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyGeographicFocusIterator theCompanyGeographicFocusIterator = (CompanyGeographicFocusIterator)findAncestorWithClass(this, CompanyGeographicFocusIterator.class);
			pageContext.getOut().print(theCompanyGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

