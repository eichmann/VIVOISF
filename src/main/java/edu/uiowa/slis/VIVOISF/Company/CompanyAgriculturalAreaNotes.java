package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyAgriculturalAreaNotesIterator theCompany = (CompanyAgriculturalAreaNotesIterator)findAncestorWithClass(this, CompanyAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theCompany.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

