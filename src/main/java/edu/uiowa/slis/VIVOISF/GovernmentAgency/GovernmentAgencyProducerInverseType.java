package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyProducerInverseIterator theGovernmentAgencyProducerInverseIterator = (GovernmentAgencyProducerInverseIterator)findAncestorWithClass(this, GovernmentAgencyProducerInverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for producer tag ");
		}
		return SKIP_BODY;
	}
}

