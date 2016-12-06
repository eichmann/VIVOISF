package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionPopulationUnitIterator thePosition = (PositionPopulationUnitIterator)findAncestorWithClass(this, PositionPopulationUnitIterator.class);
			pageContext.getOut().print(thePosition.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

