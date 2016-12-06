package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyPopulationNotesIterator theCompany = (CompanyPopulationNotesIterator)findAncestorWithClass(this, CompanyPopulationNotesIterator.class);
			pageContext.getOut().print(theCompany.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

