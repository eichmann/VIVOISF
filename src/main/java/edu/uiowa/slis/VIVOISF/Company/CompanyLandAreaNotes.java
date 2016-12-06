package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyLandAreaNotesIterator theCompany = (CompanyLandAreaNotesIterator)findAncestorWithClass(this, CompanyLandAreaNotesIterator.class);
			pageContext.getOut().print(theCompany.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

