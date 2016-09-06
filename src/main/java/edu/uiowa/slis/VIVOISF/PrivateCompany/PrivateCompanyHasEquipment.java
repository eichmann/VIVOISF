package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyHasEquipment extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyHasEquipment currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyHasEquipment.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyHasEquipmentIterator thePrivateCompanyHasEquipmentIterator = (PrivateCompanyHasEquipmentIterator)findAncestorWithClass(this, PrivateCompanyHasEquipmentIterator.class);
			pageContext.getOut().print(thePrivateCompanyHasEquipmentIterator.getHasEquipment());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

