package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonProducerInverseIterator thePersonProducerInverseIterator = (PersonProducerInverseIterator)findAncestorWithClass(this, PersonProducerInverseIterator.class);
			pageContext.getOut().print(thePersonProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for producer tag ");
		}
		return SKIP_BODY;
	}
}

