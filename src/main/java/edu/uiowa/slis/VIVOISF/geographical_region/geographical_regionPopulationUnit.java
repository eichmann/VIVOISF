package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionPopulationUnitIterator thegeographical_region = (geographical_regionPopulationUnitIterator)findAncestorWithClass(this, geographical_regionPopulationUnitIterator.class);
			pageContext.getOut().print(thegeographical_region.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

