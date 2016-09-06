package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyRO_0000053Iterator thePrivateCompanyRO_0000053Iterator = (PrivateCompanyRO_0000053Iterator)findAncestorWithClass(this, PrivateCompanyRO_0000053Iterator.class);
			pageContext.getOut().print(thePrivateCompanyRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

