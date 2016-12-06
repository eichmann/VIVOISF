package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionCountryAreaYearIterator thePosition = (PositionCountryAreaYearIterator)findAncestorWithClass(this, PositionCountryAreaYearIterator.class);
			pageContext.getOut().print(thePosition.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

