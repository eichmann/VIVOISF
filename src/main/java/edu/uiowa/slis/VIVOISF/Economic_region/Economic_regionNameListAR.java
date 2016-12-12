package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionNameListARIterator theEconomic_region = (Economic_regionNameListARIterator)findAncestorWithClass(this, Economic_regionNameListARIterator.class);
			pageContext.getOut().print(theEconomic_region.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

