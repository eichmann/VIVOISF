package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualPopulationUnitIterator theIndividual = (IndividualPopulationUnitIterator)findAncestorWithClass(this, IndividualPopulationUnitIterator.class);
			pageContext.getOut().print(theIndividual.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

