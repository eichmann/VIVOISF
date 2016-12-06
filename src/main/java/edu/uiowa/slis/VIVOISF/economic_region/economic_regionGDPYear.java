package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionGDPYearIterator theeconomic_region = (economic_regionGDPYearIterator)findAncestorWithClass(this, economic_regionGDPYearIterator.class);
			pageContext.getOut().print(theeconomic_region.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

