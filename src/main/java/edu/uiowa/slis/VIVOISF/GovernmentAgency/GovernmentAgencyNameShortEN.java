package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameShortENIterator theGovernmentAgency = (GovernmentAgencyNameShortENIterator)findAncestorWithClass(this, GovernmentAgencyNameShortENIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

