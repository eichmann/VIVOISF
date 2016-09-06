package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyERO_0000031Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyERO_0000031Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyERO_0000031Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyERO_0000031Iterator thePrivateCompanyERO_0000031Iterator = (PrivateCompanyERO_0000031Iterator)findAncestorWithClass(this, PrivateCompanyERO_0000031Iterator.class);
			pageContext.getOut().print(thePrivateCompanyERO_0000031Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

