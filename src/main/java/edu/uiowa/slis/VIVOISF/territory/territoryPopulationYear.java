package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryPopulationYearIterator theterritory = (territoryPopulationYearIterator)findAncestorWithClass(this, territoryPopulationYearIterator.class);
			pageContext.getOut().print(theterritory.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

