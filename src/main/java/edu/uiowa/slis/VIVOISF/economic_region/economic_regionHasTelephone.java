package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasTelephoneIterator theeconomic_regionHasTelephoneIterator = (economic_regionHasTelephoneIterator)findAncestorWithClass(this, economic_regionHasTelephoneIterator.class);
			pageContext.getOut().print(theeconomic_regionHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

