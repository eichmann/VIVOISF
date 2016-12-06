package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationPopulationYearIterator theLocation = (LocationPopulationYearIterator)findAncestorWithClass(this, LocationPopulationYearIterator.class);
			pageContext.getOut().print(theLocation.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

