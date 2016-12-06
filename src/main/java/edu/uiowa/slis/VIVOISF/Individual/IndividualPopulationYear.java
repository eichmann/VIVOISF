package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualPopulationYearIterator theIndividual = (IndividualPopulationYearIterator)findAncestorWithClass(this, IndividualPopulationYearIterator.class);
			pageContext.getOut().print(theIndividual.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

