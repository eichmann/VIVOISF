package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyPopulationUnitIterator theGovernmentAgency = (GovernmentAgencyPopulationUnitIterator)findAncestorWithClass(this, GovernmentAgencyPopulationUnitIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

