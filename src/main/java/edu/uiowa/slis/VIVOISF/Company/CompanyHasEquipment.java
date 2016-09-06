package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasEquipment extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasEquipment currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasEquipment.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyHasEquipmentIterator theCompanyHasEquipmentIterator = (CompanyHasEquipmentIterator)findAncestorWithClass(this, CompanyHasEquipmentIterator.class);
			pageContext.getOut().print(theCompanyHasEquipmentIterator.getHasEquipment());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

