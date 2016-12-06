package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionSourceCreator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionSourceCreator currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionSourceCreator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionSourceCreatorIterator theeconomic_region = (economic_regionSourceCreatorIterator)findAncestorWithClass(this, economic_regionSourceCreatorIterator.class);
			pageContext.getOut().print(theeconomic_region.getSourceCreator());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for sourceCreator tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for sourceCreator tag ");
		}
		return SKIP_BODY;
	}
}

