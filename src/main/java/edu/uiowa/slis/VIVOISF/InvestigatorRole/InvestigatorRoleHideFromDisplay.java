package edu.uiowa.slis.VIVOISF.InvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InvestigatorRoleHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InvestigatorRoleHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(InvestigatorRoleHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			InvestigatorRole theInvestigatorRole = (InvestigatorRole)findAncestorWithClass(this, InvestigatorRole.class);
			if (!theInvestigatorRole.commitNeeded) {
				pageContext.getOut().print(theInvestigatorRole.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing InvestigatorRole for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvestigatorRole for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			InvestigatorRole theInvestigatorRole = (InvestigatorRole)findAncestorWithClass(this, InvestigatorRole.class);
			return theInvestigatorRole.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing InvestigatorRole for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvestigatorRole for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			InvestigatorRole theInvestigatorRole = (InvestigatorRole)findAncestorWithClass(this, InvestigatorRole.class);
			theInvestigatorRole.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing InvestigatorRole for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvestigatorRole for hideFromDisplay tag ");
		}
	}
}

