package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionValidUntilIterator theEconomic_region = (Economic_regionValidUntilIterator)findAncestorWithClass(this, Economic_regionValidUntilIterator.class);
			pageContext.getOut().print(theEconomic_region.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for validUntil tag ");
		}
		return SKIP_BODY;
	}
}

