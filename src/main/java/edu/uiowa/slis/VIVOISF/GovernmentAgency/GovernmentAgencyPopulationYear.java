package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyPopulationYearIterator theGovernmentAgency = (GovernmentAgencyPopulationYearIterator)findAncestorWithClass(this, GovernmentAgencyPopulationYearIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

