package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionSourceCreator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionSourceCreator currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionSourceCreator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionSourceCreatorIterator theEconomic_region = (Economic_regionSourceCreatorIterator)findAncestorWithClass(this, Economic_regionSourceCreatorIterator.class);
			pageContext.getOut().print(theEconomic_region.getSourceCreator());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for sourceCreator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for sourceCreator tag ");
		}
		return SKIP_BODY;
	}
}

