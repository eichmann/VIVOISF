package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionHDIYearIterator theeconomic_region = (economic_regionHDIYearIterator)findAncestorWithClass(this, economic_regionHDIYearIterator.class);
			pageContext.getOut().print(theeconomic_region.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

