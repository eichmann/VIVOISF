package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameListENIterator theEconomic_region = (Economic_regionNameListENIterator)findAncestorWithClass(this, Economic_regionNameListENIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

