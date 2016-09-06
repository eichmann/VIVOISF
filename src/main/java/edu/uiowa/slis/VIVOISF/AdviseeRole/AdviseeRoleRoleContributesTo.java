package edu.uiowa.slis.VIVOISF.AdviseeRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdviseeRoleRoleContributesTo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdviseeRoleRoleContributesTo currentInstance = null;
	private static final Log log = LogFactory.getLog(AdviseeRoleRoleContributesTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AdviseeRoleRoleContributesToIterator theAdviseeRoleRoleContributesToIterator = (AdviseeRoleRoleContributesToIterator)findAncestorWithClass(this, AdviseeRoleRoleContributesToIterator.class);
			pageContext.getOut().print(theAdviseeRoleRoleContributesToIterator.getRoleContributesTo());
		} catch (Exception e) {
			log.error("Can't find enclosing AdviseeRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdviseeRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

