package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryPopulationUnitIterator theterritory = (territoryPopulationUnitIterator)findAncestorWithClass(this, territoryPopulationUnitIterator.class);
			pageContext.getOut().print(theterritory.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

