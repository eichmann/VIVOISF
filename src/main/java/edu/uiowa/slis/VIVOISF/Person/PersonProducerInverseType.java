package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonProducerInverseIterator thePersonProducerInverseIterator = (PersonProducerInverseIterator)findAncestorWithClass(this, PersonProducerInverseIterator.class);
			pageContext.getOut().print(thePersonProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for producer tag ");
		}
		return SKIP_BODY;
	}
}

