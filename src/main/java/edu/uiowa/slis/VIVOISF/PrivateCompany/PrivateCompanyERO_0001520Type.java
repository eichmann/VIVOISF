package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyERO_0001520Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyERO_0001520Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyERO_0001520Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyERO_0001520Iterator thePrivateCompanyERO_0001520Iterator = (PrivateCompanyERO_0001520Iterator)findAncestorWithClass(this, PrivateCompanyERO_0001520Iterator.class);
			pageContext.getOut().print(thePrivateCompanyERO_0001520Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

