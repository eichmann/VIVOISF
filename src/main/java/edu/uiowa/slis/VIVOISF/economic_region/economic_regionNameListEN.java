package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameListENIterator theeconomic_region = (economic_regionNameListENIterator)findAncestorWithClass(this, economic_regionNameListENIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

