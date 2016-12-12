package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionSourceIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionSourceIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionSourceIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Economic_regionSourceIdentifierIterator theEconomic_region = (Economic_regionSourceIdentifierIterator)findAncestorWithClass(this, Economic_regionSourceIdentifierIterator.class);
			pageContext.getOut().print(theEconomic_region.getSourceIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for sourceIdentifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for sourceIdentifier tag ");
		}
		return SKIP_BODY;
	}
}

