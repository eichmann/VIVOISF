package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaCountryAreaYearIterator theArea = (AreaCountryAreaYearIterator)findAncestorWithClass(this, AreaCountryAreaYearIterator.class);
			pageContext.getOut().print(theArea.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

