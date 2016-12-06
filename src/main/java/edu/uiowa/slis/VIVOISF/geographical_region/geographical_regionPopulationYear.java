package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionPopulationYearIterator thegeographical_region = (geographical_regionPopulationYearIterator)findAncestorWithClass(this, geographical_regionPopulationYearIterator.class);
			pageContext.getOut().print(thegeographical_region.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

