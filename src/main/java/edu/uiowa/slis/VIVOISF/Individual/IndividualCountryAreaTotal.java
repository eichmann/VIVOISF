package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualCountryAreaTotalIterator theIndividual = (IndividualCountryAreaTotalIterator)findAncestorWithClass(this, IndividualCountryAreaTotalIterator.class);
			pageContext.getOut().print(theIndividual.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

