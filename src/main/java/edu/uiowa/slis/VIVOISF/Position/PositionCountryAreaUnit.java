package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionCountryAreaUnitIterator thePosition = (PositionCountryAreaUnitIterator)findAncestorWithClass(this, PositionCountryAreaUnitIterator.class);
			pageContext.getOut().print(thePosition.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

