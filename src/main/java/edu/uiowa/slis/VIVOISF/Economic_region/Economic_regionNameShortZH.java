package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameShortZHIterator theEconomic_region = (Economic_regionNameShortZHIterator)findAncestorWithClass(this, Economic_regionNameShortZHIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

