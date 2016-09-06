package edu.uiowa.slis.VIVOISF.OutreachProviderRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OutreachProviderRoleRO_0000052Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OutreachProviderRoleRO_0000052Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OutreachProviderRoleRO_0000052Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OutreachProviderRoleRO_0000052Iterator theOutreachProviderRoleRO_0000052Iterator = (OutreachProviderRoleRO_0000052Iterator)findAncestorWithClass(this, OutreachProviderRoleRO_0000052Iterator.class);
			pageContext.getOut().print(theOutreachProviderRoleRO_0000052Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OutreachProviderRole for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OutreachProviderRole for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

