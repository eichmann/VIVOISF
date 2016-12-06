package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualPublisherIterator theIndividualPublisherIterator = (IndividualPublisherIterator)findAncestorWithClass(this, IndividualPublisherIterator.class);
			pageContext.getOut().print(theIndividualPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for publisher tag ");
		}
		return SKIP_BODY;
	}
}

