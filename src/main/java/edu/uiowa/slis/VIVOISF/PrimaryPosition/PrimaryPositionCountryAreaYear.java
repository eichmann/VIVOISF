package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionCountryAreaYearIterator thePrimaryPosition = (PrimaryPositionCountryAreaYearIterator)findAncestorWithClass(this, PrimaryPositionCountryAreaYearIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

