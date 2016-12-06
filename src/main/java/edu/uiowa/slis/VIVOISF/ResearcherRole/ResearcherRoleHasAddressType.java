package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleHasAddressIterator theResearcherRoleHasAddressIterator = (ResearcherRoleHasAddressIterator)findAncestorWithClass(this, ResearcherRoleHasAddressIterator.class);
			pageContext.getOut().print(theResearcherRoleHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}
