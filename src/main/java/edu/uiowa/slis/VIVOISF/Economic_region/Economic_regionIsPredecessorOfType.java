package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionIsPredecessorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionIsPredecessorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionIsPredecessorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Economic_regionIsPredecessorOfIterator theEconomic_regionIsPredecessorOfIterator = (Economic_regionIsPredecessorOfIterator)findAncestorWithClass(this, Economic_regionIsPredecessorOfIterator.class);
			pageContext.getOut().print(theEconomic_regionIsPredecessorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}

