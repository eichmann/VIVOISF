package edu.uiowa.slis.VIVOISF.InvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InvestigatorRoleRoleContributesTo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InvestigatorRoleRoleContributesTo currentInstance = null;
	private static final Log log = LogFactory.getLog(InvestigatorRoleRoleContributesTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InvestigatorRoleRoleContributesToIterator theInvestigatorRoleRoleContributesToIterator = (InvestigatorRoleRoleContributesToIterator)findAncestorWithClass(this, InvestigatorRoleRoleContributesToIterator.class);
			pageContext.getOut().print(theInvestigatorRoleRoleContributesToIterator.getRoleContributesTo());
		} catch (Exception e) {
			log.error("Can't find enclosing InvestigatorRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvestigatorRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

