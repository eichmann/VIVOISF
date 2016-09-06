package edu.uiowa.slis.VIVOISF.AdvisorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdvisorRoleBFO_0000054Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdvisorRoleBFO_0000054Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AdvisorRoleBFO_0000054Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AdvisorRoleBFO_0000054Iterator theAdvisorRoleBFO_0000054Iterator = (AdvisorRoleBFO_0000054Iterator)findAncestorWithClass(this, AdvisorRoleBFO_0000054Iterator.class);
			pageContext.getOut().print(theAdvisorRoleBFO_0000054Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisorRole for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisorRole for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

