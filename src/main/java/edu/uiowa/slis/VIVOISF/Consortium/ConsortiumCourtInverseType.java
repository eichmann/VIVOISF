package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumCourtInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumCourtInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumCourtInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumCourtInverseIterator theConsortiumCourtInverseIterator = (ConsortiumCourtInverseIterator)findAncestorWithClass(this, ConsortiumCourtInverseIterator.class);
			pageContext.getOut().print(theConsortiumCourtInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for court tag ");
		}
		return SKIP_BODY;
	}
}

