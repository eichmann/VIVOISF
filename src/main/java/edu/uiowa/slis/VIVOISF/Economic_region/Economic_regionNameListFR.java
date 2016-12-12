package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameListFRIterator theEconomic_region = (Economic_regionNameListFRIterator)findAncestorWithClass(this, Economic_regionNameListFRIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

