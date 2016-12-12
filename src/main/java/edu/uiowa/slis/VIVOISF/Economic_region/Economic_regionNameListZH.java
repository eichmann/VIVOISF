package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameListZHIterator theEconomic_region = (Economic_regionNameListZHIterator)findAncestorWithClass(this, Economic_regionNameListZHIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

