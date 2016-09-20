package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedOrcidIdInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedOrcidIdInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedOrcidIdInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			disputedOrcidIdInverseIterator thedisputedOrcidIdInverseIterator = (disputedOrcidIdInverseIterator)findAncestorWithClass(this, disputedOrcidIdInverseIterator.class);
			pageContext.getOut().print(thedisputedOrcidIdInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

