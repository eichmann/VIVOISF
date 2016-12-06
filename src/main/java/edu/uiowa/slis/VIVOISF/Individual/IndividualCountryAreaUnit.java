package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualCountryAreaUnitIterator theIndividual = (IndividualCountryAreaUnitIterator)findAncestorWithClass(this, IndividualCountryAreaUnitIterator.class);
			pageContext.getOut().print(theIndividual.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

