package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameOfficialZHIterator theeconomic_region = (economic_regionNameOfficialZHIterator)findAncestorWithClass(this, economic_regionNameOfficialZHIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

