package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentPopulationYearIterator theContinent = (ContinentPopulationYearIterator)findAncestorWithClass(this, ContinentPopulationYearIterator.class);
			pageContext.getOut().print(theContinent.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

