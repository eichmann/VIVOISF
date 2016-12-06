package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionPopulationYearIterator thePosition = (PositionPopulationYearIterator)findAncestorWithClass(this, PositionPopulationYearIterator.class);
			pageContext.getOut().print(thePosition.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

