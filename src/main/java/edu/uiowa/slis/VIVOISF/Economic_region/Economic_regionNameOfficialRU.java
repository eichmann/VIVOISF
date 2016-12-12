package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameOfficialRUIterator theEconomic_region = (Economic_regionNameOfficialRUIterator)findAncestorWithClass(this, Economic_regionNameOfficialRUIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

