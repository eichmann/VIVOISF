package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasMinLongitudeIterator theeconomic_region = (economic_regionHasMinLongitudeIterator)findAncestorWithClass(this, economic_regionHasMinLongitudeIterator.class);
			pageContext.getOut().print(theeconomic_region.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

