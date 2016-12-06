package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasTitleIterator theGovernmentAgencyHasTitleIterator = (GovernmentAgencyHasTitleIterator)findAncestorWithClass(this, GovernmentAgencyHasTitleIterator.class);
			pageContext.getOut().print(theGovernmentAgencyHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

