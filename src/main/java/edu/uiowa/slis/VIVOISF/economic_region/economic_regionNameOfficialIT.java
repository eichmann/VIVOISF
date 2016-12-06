package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameOfficialITIterator theeconomic_region = (economic_regionNameOfficialITIterator)findAncestorWithClass(this, economic_regionNameOfficialITIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

