package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameOfficialARIterator theeconomic_region = (economic_regionNameOfficialARIterator)findAncestorWithClass(this, economic_regionNameOfficialARIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

