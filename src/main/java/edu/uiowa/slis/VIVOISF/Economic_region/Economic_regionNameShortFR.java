package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameShortFRIterator theEconomic_region = (Economic_regionNameShortFRIterator)findAncestorWithClass(this, Economic_regionNameShortFRIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

