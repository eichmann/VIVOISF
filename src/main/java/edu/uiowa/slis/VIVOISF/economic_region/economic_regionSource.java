package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionSource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionSource currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionSource.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionSourceIterator theeconomic_region = (economic_regionSourceIterator)findAncestorWithClass(this, economic_regionSourceIterator.class);
			pageContext.getOut().print(theeconomic_region.getSource());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for source tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for source tag ");
		}
		return SKIP_BODY;
	}
}

