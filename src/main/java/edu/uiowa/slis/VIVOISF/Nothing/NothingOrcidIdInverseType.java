package edu.uiowa.slis.VIVOISF.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingOrcidIdInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NothingOrcidIdInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingOrcidIdInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NothingOrcidIdInverseIterator theNothingOrcidIdInverseIterator = (NothingOrcidIdInverseIterator)findAncestorWithClass(this, NothingOrcidIdInverseIterator.class);
			pageContext.getOut().print(theNothingOrcidIdInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

