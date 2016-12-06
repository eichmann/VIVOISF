package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingOrcidIdInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingOrcidIdInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingOrcidIdInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingOrcidIdInverseIterator thenon_self_governingOrcidIdInverseIterator = (non_self_governingOrcidIdInverseIterator)findAncestorWithClass(this, non_self_governingOrcidIdInverseIterator.class);
			pageContext.getOut().print(thenon_self_governingOrcidIdInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

