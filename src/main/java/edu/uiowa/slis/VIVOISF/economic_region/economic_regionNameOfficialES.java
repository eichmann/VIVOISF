package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameOfficialESIterator theeconomic_region = (economic_regionNameOfficialESIterator)findAncestorWithClass(this, economic_regionNameOfficialESIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

