package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameOfficialFRIterator theeconomic_region = (economic_regionNameOfficialFRIterator)findAncestorWithClass(this, economic_regionNameOfficialFRIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

