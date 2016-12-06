package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasMaxLongitudeIterator theeconomic_region = (economic_regionHasMaxLongitudeIterator)findAncestorWithClass(this, economic_regionHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theeconomic_region.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

