package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameShortARIterator theEconomic_region = (Economic_regionNameShortARIterator)findAncestorWithClass(this, Economic_regionNameShortARIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

