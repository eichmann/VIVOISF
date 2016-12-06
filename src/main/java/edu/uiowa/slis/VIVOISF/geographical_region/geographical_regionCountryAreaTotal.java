package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionCountryAreaTotalIterator thegeographical_region = (geographical_regionCountryAreaTotalIterator)findAncestorWithClass(this, geographical_regionCountryAreaTotalIterator.class);
			pageContext.getOut().print(thegeographical_region.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

