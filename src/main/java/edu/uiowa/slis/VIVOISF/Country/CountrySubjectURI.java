package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountrySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountrySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CountrySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Country theCountry = (Country)findAncestorWithClass(this, Country.class);
			if (!theCountry.commitNeeded) {
				pageContext.getOut().print(theCountry.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Country for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Country theCountry = (Country)findAncestorWithClass(this, Country.class);
			return theCountry.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Country for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Country theCountry = (Country)findAncestorWithClass(this, Country.class);
			theCountry.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Country for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for subjectURI tag ");
		}
	}
}

