package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameOfficialENIterator theeconomic_region = (economic_regionNameOfficialENIterator)findAncestorWithClass(this, economic_regionNameOfficialENIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

