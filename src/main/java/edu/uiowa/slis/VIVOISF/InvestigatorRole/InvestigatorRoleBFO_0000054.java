package edu.uiowa.slis.VIVOISF.InvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InvestigatorRoleBFO_0000054 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InvestigatorRoleBFO_0000054 currentInstance = null;
	private static final Log log = LogFactory.getLog(InvestigatorRoleBFO_0000054.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InvestigatorRoleBFO_0000054Iterator theInvestigatorRoleBFO_0000054Iterator = (InvestigatorRoleBFO_0000054Iterator)findAncestorWithClass(this, InvestigatorRoleBFO_0000054Iterator.class);
			pageContext.getOut().print(theInvestigatorRoleBFO_0000054Iterator.getBFO_0000054());
		} catch (Exception e) {
			log.error("Can't find enclosing InvestigatorRole for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvestigatorRole for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

