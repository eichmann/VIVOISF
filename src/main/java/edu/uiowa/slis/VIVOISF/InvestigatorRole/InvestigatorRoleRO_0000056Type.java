package edu.uiowa.slis.VIVOISF.InvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InvestigatorRoleRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InvestigatorRoleRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(InvestigatorRoleRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InvestigatorRoleRO_0000056Iterator theInvestigatorRoleRO_0000056Iterator = (InvestigatorRoleRO_0000056Iterator)findAncestorWithClass(this, InvestigatorRoleRO_0000056Iterator.class);
			pageContext.getOut().print(theInvestigatorRoleRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing InvestigatorRole for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvestigatorRole for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

