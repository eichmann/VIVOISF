package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379PopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379PopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379PopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379PopulationUnitIterator theARG_2000379 = (ARG_2000379PopulationUnitIterator)findAncestorWithClass(this, ARG_2000379PopulationUnitIterator.class);
			pageContext.getOut().print(theARG_2000379.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

