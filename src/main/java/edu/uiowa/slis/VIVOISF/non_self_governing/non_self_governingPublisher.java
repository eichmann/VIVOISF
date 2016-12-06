package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingPublisherIterator thenon_self_governingPublisherIterator = (non_self_governingPublisherIterator)findAncestorWithClass(this, non_self_governingPublisherIterator.class);
			pageContext.getOut().print(thenon_self_governingPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for publisher tag ");
		}
		return SKIP_BODY;
	}
}

