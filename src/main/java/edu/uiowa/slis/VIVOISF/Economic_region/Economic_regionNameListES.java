package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameListESIterator theEconomic_region = (Economic_regionNameListESIterator)findAncestorWithClass(this, Economic_regionNameListESIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

