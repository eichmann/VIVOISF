package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameOfficialENIterator theEconomic_region = (Economic_regionNameOfficialENIterator)findAncestorWithClass(this, Economic_regionNameOfficialENIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

