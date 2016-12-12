package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionValidSinceIterator theEconomic_region = (Economic_regionValidSinceIterator)findAncestorWithClass(this, Economic_regionValidSinceIterator.class);
			pageContext.getOut().print(theEconomic_region.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for validSince tag ");
		}
		return SKIP_BODY;
	}
}

