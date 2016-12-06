package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionCountryAreaTotalIterator thePrimaryPosition = (PrimaryPositionCountryAreaTotalIterator)findAncestorWithClass(this, PrimaryPositionCountryAreaTotalIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

