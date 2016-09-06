package edu.uiowa.slis.VIVOISF.AdvisorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdvisorRoleRO_0000052Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdvisorRoleRO_0000052Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AdvisorRoleRO_0000052Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AdvisorRoleRO_0000052Iterator theAdvisorRoleRO_0000052Iterator = (AdvisorRoleRO_0000052Iterator)findAncestorWithClass(this, AdvisorRoleRO_0000052Iterator.class);
			pageContext.getOut().print(theAdvisorRoleRO_0000052Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisorRole for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisorRole for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

