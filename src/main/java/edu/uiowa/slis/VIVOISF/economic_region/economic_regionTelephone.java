package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionTelephone.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionTelephoneIterator theeconomic_region = (economic_regionTelephoneIterator)findAncestorWithClass(this, economic_regionTelephoneIterator.class);
			pageContext.getOut().print(theeconomic_region.getTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for telephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for telephone tag ");
		}
		return SKIP_BODY;
	}
}

