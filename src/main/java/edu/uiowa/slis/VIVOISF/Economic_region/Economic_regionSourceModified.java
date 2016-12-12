package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionSourceModified extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionSourceModified currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionSourceModified.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionSourceModifiedIterator theEconomic_region = (Economic_regionSourceModifiedIterator)findAncestorWithClass(this, Economic_regionSourceModifiedIterator.class);
			pageContext.getOut().print(theEconomic_region.getSourceModified());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for sourceModified tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for sourceModified tag ");
		}
		return SKIP_BODY;
	}
}

