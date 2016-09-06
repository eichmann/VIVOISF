package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualHasAddressIterator theIndividualHasAddressIterator = (IndividualHasAddressIterator)findAncestorWithClass(this, IndividualHasAddressIterator.class);
			pageContext.getOut().print(theIndividualHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

