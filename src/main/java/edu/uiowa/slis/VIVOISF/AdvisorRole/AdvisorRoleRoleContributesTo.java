package edu.uiowa.slis.VIVOISF.AdvisorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdvisorRoleRoleContributesTo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdvisorRoleRoleContributesTo currentInstance = null;
	private static final Log log = LogFactory.getLog(AdvisorRoleRoleContributesTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AdvisorRoleRoleContributesToIterator theAdvisorRoleRoleContributesToIterator = (AdvisorRoleRoleContributesToIterator)findAncestorWithClass(this, AdvisorRoleRoleContributesToIterator.class);
			pageContext.getOut().print(theAdvisorRoleRoleContributesToIterator.getRoleContributesTo());
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisorRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisorRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

