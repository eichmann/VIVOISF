package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionLandAreaYearIterator theeconomic_region = (economic_regionLandAreaYearIterator)findAncestorWithClass(this, economic_regionLandAreaYearIterator.class);
			pageContext.getOut().print(theeconomic_region.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

