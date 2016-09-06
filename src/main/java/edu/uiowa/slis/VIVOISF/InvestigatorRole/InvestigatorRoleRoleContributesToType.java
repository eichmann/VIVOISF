package edu.uiowa.slis.VIVOISF.InvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InvestigatorRoleRoleContributesToType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InvestigatorRoleRoleContributesToType currentInstance = null;
	private static final Log log = LogFactory.getLog(InvestigatorRoleRoleContributesToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InvestigatorRoleRoleContributesToIterator theInvestigatorRoleRoleContributesToIterator = (InvestigatorRoleRoleContributesToIterator)findAncestorWithClass(this, InvestigatorRoleRoleContributesToIterator.class);
			pageContext.getOut().print(theInvestigatorRoleRoleContributesToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing InvestigatorRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvestigatorRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

