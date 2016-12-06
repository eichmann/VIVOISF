package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionPopulationTotalIterator thePosition = (PositionPopulationTotalIterator)findAncestorWithClass(this, PositionPopulationTotalIterator.class);
			pageContext.getOut().print(thePosition.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

