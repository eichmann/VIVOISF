package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionTopDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionTopDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionTopDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionTopDataPropertyIterator theeconomic_region = (economic_regionTopDataPropertyIterator)findAncestorWithClass(this, economic_regionTopDataPropertyIterator.class);
			pageContext.getOut().print(theeconomic_region.getTopDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for topDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for topDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

