package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionCodeFAOTERMIterator theEconomic_region = (Economic_regionCodeFAOTERMIterator)findAncestorWithClass(this, Economic_regionCodeFAOTERMIterator.class);
			pageContext.getOut().print(theEconomic_region.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

