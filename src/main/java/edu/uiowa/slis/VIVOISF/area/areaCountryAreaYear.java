package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(areaCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaCountryAreaYearIterator thearea = (areaCountryAreaYearIterator)findAncestorWithClass(this, areaCountryAreaYearIterator.class);
			pageContext.getOut().print(thearea.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing area for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

