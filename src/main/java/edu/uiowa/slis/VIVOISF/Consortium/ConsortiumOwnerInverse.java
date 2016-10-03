package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumOwnerInverseIterator theConsortiumOwnerInverseIterator = (ConsortiumOwnerInverseIterator)findAncestorWithClass(this, ConsortiumOwnerInverseIterator.class);
			pageContext.getOut().print(theConsortiumOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for owner tag ");
		}
		return SKIP_BODY;
	}
}

