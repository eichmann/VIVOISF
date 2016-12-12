package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaPopulationUnitIterator theArea = (AreaPopulationUnitIterator)findAncestorWithClass(this, AreaPopulationUnitIterator.class);
			pageContext.getOut().print(theArea.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

