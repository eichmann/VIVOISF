package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionCountryAreaUnitIterator thegeographical_region = (geographical_regionCountryAreaUnitIterator)findAncestorWithClass(this, geographical_regionCountryAreaUnitIterator.class);
			pageContext.getOut().print(thegeographical_region.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

