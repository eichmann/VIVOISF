package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationPopulationUnitIterator theLocation = (LocationPopulationUnitIterator)findAncestorWithClass(this, LocationPopulationUnitIterator.class);
			pageContext.getOut().print(theLocation.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

