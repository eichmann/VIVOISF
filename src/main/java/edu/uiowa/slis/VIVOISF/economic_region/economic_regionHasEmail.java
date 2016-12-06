package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasEmailIterator theeconomic_regionHasEmailIterator = (economic_regionHasEmailIterator)findAncestorWithClass(this, economic_regionHasEmailIterator.class);
			pageContext.getOut().print(theeconomic_regionHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

