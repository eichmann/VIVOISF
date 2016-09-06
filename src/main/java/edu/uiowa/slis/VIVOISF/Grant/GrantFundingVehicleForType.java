package edu.uiowa.slis.VIVOISF.Grant;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GrantFundingVehicleForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GrantFundingVehicleForType currentInstance = null;
	private static final Log log = LogFactory.getLog(GrantFundingVehicleForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GrantFundingVehicleForIterator theGrantFundingVehicleForIterator = (GrantFundingVehicleForIterator)findAncestorWithClass(this, GrantFundingVehicleForIterator.class);
			pageContext.getOut().print(theGrantFundingVehicleForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Grant for fundingVehicleFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for fundingVehicleFor tag ");
		}
		return SKIP_BODY;
	}
}

