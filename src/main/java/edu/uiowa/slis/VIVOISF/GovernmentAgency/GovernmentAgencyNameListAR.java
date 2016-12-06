package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameListARIterator theGovernmentAgency = (GovernmentAgencyNameListARIterator)findAncestorWithClass(this, GovernmentAgencyNameListARIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

