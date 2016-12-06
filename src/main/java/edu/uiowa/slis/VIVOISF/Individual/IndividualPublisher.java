package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualPublisherIterator theIndividualPublisherIterator = (IndividualPublisherIterator)findAncestorWithClass(this, IndividualPublisherIterator.class);
			pageContext.getOut().print(theIndividualPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for publisher tag ");
		}
		return SKIP_BODY;
	}
}

