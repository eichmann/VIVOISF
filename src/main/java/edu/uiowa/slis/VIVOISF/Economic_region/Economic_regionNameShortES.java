package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameShortESIterator theEconomic_region = (Economic_regionNameShortESIterator)findAncestorWithClass(this, Economic_regionNameShortESIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

