package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasMaxLatitudeIterator theeconomic_region = (economic_regionHasMaxLatitudeIterator)findAncestorWithClass(this, economic_regionHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theeconomic_region.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

