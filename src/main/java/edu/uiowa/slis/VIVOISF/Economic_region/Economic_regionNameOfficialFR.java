package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameOfficialFRIterator theEconomic_region = (Economic_regionNameOfficialFRIterator)findAncestorWithClass(this, Economic_regionNameOfficialFRIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

