package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameOfficialITIterator theEconomic_region = (Economic_regionNameOfficialITIterator)findAncestorWithClass(this, Economic_regionNameOfficialITIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

