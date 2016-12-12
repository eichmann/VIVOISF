package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameShortENIterator theEconomic_region = (Economic_regionNameShortENIterator)findAncestorWithClass(this, Economic_regionNameShortENIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

