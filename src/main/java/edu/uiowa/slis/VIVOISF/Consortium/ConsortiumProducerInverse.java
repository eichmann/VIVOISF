package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumProducerInverseIterator theConsortiumProducerInverseIterator = (ConsortiumProducerInverseIterator)findAncestorWithClass(this, ConsortiumProducerInverseIterator.class);
			pageContext.getOut().print(theConsortiumProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for producer tag ");
		}
		return SKIP_BODY;
	}
}

