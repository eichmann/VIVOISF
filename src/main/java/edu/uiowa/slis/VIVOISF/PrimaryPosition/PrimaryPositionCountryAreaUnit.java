package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionCountryAreaUnitIterator thePrimaryPosition = (PrimaryPositionCountryAreaUnitIterator)findAncestorWithClass(this, PrimaryPositionCountryAreaUnitIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

