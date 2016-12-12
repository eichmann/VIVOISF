package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameShortRUIterator theEconomic_region = (Economic_regionNameShortRUIterator)findAncestorWithClass(this, Economic_regionNameShortRUIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

