package edu.uiowa.slis.VIVOISF.InvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InvestigatorRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InvestigatorRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(InvestigatorRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			InvestigatorRole theInvestigatorRole = (InvestigatorRole)findAncestorWithClass(this, InvestigatorRole.class);
			if (!theInvestigatorRole.commitNeeded) {
				pageContext.getOut().print(theInvestigatorRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing InvestigatorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvestigatorRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			InvestigatorRole theInvestigatorRole = (InvestigatorRole)findAncestorWithClass(this, InvestigatorRole.class);
			return theInvestigatorRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing InvestigatorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvestigatorRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			InvestigatorRole theInvestigatorRole = (InvestigatorRole)findAncestorWithClass(this, InvestigatorRole.class);
			theInvestigatorRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing InvestigatorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvestigatorRole for label tag ");
		}
	}
}

