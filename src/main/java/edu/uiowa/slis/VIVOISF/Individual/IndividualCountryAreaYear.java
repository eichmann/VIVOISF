package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualCountryAreaYearIterator theIndividual = (IndividualCountryAreaYearIterator)findAncestorWithClass(this, IndividualCountryAreaYearIterator.class);
			pageContext.getOut().print(theIndividual.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

