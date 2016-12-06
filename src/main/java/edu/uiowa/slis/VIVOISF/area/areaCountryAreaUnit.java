package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(areaCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaCountryAreaUnitIterator thearea = (areaCountryAreaUnitIterator)findAncestorWithClass(this, areaCountryAreaUnitIterator.class);
			pageContext.getOut().print(thearea.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing area for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

