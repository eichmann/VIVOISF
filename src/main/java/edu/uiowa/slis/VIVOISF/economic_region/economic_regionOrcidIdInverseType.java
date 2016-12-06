package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionOrcidIdInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionOrcidIdInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionOrcidIdInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionOrcidIdInverseIterator theeconomic_regionOrcidIdInverseIterator = (economic_regionOrcidIdInverseIterator)findAncestorWithClass(this, economic_regionOrcidIdInverseIterator.class);
			pageContext.getOut().print(theeconomic_regionOrcidIdInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

