package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Company theCompany = (Company)findAncestorWithClass(this, Company.class);
			if (!theCompany.commitNeeded) {
				pageContext.getOut().print(theCompany.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Company for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Company theCompany = (Company)findAncestorWithClass(this, Company.class);
			return theCompany.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Company for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Company theCompany = (Company)findAncestorWithClass(this, Company.class);
			theCompany.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Company for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for placeOfPublication tag ");
		}
	}
}

