package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameOfficialZHIterator theEconomic_region = (Economic_regionNameOfficialZHIterator)findAncestorWithClass(this, Economic_regionNameOfficialZHIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

