package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasResearchAreaIterator theGovernmentAgencyHasResearchAreaIterator = (GovernmentAgencyHasResearchAreaIterator)findAncestorWithClass(this, GovernmentAgencyHasResearchAreaIterator.class);
			pageContext.getOut().print(theGovernmentAgencyHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

