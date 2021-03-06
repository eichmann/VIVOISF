package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionIsSuccessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionIsSuccessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionIsSuccessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Economic_regionIsSuccessorOfIterator theEconomic_regionIsSuccessorOfIterator = (Economic_regionIsSuccessorOfIterator)findAncestorWithClass(this, Economic_regionIsSuccessorOfIterator.class);
			pageContext.getOut().print(theEconomic_regionIsSuccessorOfIterator.getIsSuccessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}

