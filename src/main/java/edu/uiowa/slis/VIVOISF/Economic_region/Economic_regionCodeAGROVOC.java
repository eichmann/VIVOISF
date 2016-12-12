package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionCodeAGROVOCIterator theEconomic_region = (Economic_regionCodeAGROVOCIterator)findAncestorWithClass(this, Economic_regionCodeAGROVOCIterator.class);
			pageContext.getOut().print(theEconomic_region.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

