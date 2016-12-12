package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaPopulationYearIterator theArea = (AreaPopulationYearIterator)findAncestorWithClass(this, AreaPopulationYearIterator.class);
			pageContext.getOut().print(theArea.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

