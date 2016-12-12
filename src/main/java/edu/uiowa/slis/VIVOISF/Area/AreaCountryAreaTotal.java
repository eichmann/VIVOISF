package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaCountryAreaTotalIterator theArea = (AreaCountryAreaTotalIterator)findAncestorWithClass(this, AreaCountryAreaTotalIterator.class);
			pageContext.getOut().print(theArea.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

