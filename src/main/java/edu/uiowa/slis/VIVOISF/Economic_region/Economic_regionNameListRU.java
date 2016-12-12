package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameListRUIterator theEconomic_region = (Economic_regionNameListRUIterator)findAncestorWithClass(this, Economic_regionNameListRUIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

