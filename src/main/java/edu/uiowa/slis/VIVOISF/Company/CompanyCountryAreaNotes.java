package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyCountryAreaNotesIterator theCompany = (CompanyCountryAreaNotesIterator)findAncestorWithClass(this, CompanyCountryAreaNotesIterator.class);
			pageContext.getOut().print(theCompany.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

