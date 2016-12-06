package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(areaCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaCountryAreaTotalIterator thearea = (areaCountryAreaTotalIterator)findAncestorWithClass(this, areaCountryAreaTotalIterator.class);
			pageContext.getOut().print(thearea.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing area for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

