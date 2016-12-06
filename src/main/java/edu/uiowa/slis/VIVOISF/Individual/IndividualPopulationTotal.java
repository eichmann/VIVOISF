package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualPopulationTotalIterator theIndividual = (IndividualPopulationTotalIterator)findAncestorWithClass(this, IndividualPopulationTotalIterator.class);
			pageContext.getOut().print(theIndividual.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

