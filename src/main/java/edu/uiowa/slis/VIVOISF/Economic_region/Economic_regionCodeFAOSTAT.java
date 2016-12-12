package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionCodeFAOSTATIterator theEconomic_region = (Economic_regionCodeFAOSTATIterator)findAncestorWithClass(this, Economic_regionCodeFAOSTATIterator.class);
			pageContext.getOut().print(theEconomic_region.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

