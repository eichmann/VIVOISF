package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameListENIterator theGovernmentAgency = (GovernmentAgencyNameListENIterator)findAncestorWithClass(this, GovernmentAgencyNameListENIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

