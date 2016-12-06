package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingOrcidIdInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingOrcidIdInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingOrcidIdInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingOrcidIdInverseIterator theself_governingOrcidIdInverseIterator = (self_governingOrcidIdInverseIterator)findAncestorWithClass(this, self_governingOrcidIdInverseIterator.class);
			pageContext.getOut().print(theself_governingOrcidIdInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

