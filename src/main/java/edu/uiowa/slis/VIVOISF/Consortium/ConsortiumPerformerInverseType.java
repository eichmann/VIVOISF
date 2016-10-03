package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumPerformerInverseIterator theConsortiumPerformerInverseIterator = (ConsortiumPerformerInverseIterator)findAncestorWithClass(this, ConsortiumPerformerInverseIterator.class);
			pageContext.getOut().print(theConsortiumPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for performer tag ");
		}
		return SKIP_BODY;
	}
}

