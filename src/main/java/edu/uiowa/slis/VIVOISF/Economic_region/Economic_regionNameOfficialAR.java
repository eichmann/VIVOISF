package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameOfficialARIterator theEconomic_region = (Economic_regionNameOfficialARIterator)findAncestorWithClass(this, Economic_regionNameOfficialARIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

