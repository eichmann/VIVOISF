package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasOfficialName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasOfficialName currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasOfficialName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasOfficialNameIterator theeconomic_region = (economic_regionHasOfficialNameIterator)findAncestorWithClass(this, economic_regionHasOfficialNameIterator.class);
			pageContext.getOut().print(theeconomic_region.getHasOfficialName());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasOfficialName tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasOfficialName tag ");
		}
		return SKIP_BODY;
	}
}

