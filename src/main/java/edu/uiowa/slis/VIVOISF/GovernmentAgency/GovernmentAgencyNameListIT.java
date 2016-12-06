package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameListITIterator theGovernmentAgency = (GovernmentAgencyNameListITIterator)findAncestorWithClass(this, GovernmentAgencyNameListITIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}
