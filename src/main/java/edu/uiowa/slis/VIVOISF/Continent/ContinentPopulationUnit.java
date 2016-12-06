package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentPopulationUnitIterator theContinent = (ContinentPopulationUnitIterator)findAncestorWithClass(this, ContinentPopulationUnitIterator.class);
			pageContext.getOut().print(theContinent.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

