package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameShortENIterator theeconomic_region = (economic_regionNameShortENIterator)findAncestorWithClass(this, economic_regionNameShortENIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

