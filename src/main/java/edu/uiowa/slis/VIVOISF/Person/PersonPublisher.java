package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonPublisherIterator thePersonPublisherIterator = (PersonPublisherIterator)findAncestorWithClass(this, PersonPublisherIterator.class);
			pageContext.getOut().print(thePersonPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for publisher tag ");
		}
		return SKIP_BODY;
	}
}

