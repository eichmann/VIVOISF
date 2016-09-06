package edu.uiowa.slis.VIVOISF.OutreachProviderRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OutreachProviderRoleBFO_0000054 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OutreachProviderRoleBFO_0000054 currentInstance = null;
	private static final Log log = LogFactory.getLog(OutreachProviderRoleBFO_0000054.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OutreachProviderRoleBFO_0000054Iterator theOutreachProviderRoleBFO_0000054Iterator = (OutreachProviderRoleBFO_0000054Iterator)findAncestorWithClass(this, OutreachProviderRoleBFO_0000054Iterator.class);
			pageContext.getOut().print(theOutreachProviderRoleBFO_0000054Iterator.getBFO_0000054());
		} catch (Exception e) {
			log.error("Can't find enclosing OutreachProviderRole for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OutreachProviderRole for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

