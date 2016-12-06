package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyGDPNotesIterator theCompany = (CompanyGDPNotesIterator)findAncestorWithClass(this, CompanyGDPNotesIterator.class);
			pageContext.getOut().print(theCompany.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

