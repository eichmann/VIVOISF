package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentPopulationTotalIterator theContinent = (ContinentPopulationTotalIterator)findAncestorWithClass(this, ContinentPopulationTotalIterator.class);
			pageContext.getOut().print(theContinent.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

