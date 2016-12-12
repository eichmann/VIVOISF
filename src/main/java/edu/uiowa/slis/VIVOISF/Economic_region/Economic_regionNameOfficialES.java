package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameOfficialESIterator theEconomic_region = (Economic_regionNameOfficialESIterator)findAncestorWithClass(this, Economic_regionNameOfficialESIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

