package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionAgriculturalAreaYearIterator theeconomic_region = (economic_regionAgriculturalAreaYearIterator)findAncestorWithClass(this, economic_regionAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theeconomic_region.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}
