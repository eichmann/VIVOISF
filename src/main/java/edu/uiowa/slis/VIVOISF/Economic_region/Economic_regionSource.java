package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionSource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionSource currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionSource.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionSourceIterator theEconomic_region = (Economic_regionSourceIterator)findAncestorWithClass(this, Economic_regionSourceIterator.class);
			pageContext.getOut().print(theEconomic_region.getSource());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for source tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for source tag ");
		}
		return SKIP_BODY;
	}
}

