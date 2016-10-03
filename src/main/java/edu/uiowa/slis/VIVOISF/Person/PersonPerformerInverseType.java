package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonPerformerInverseIterator thePersonPerformerInverseIterator = (PersonPerformerInverseIterator)findAncestorWithClass(this, PersonPerformerInverseIterator.class);
			pageContext.getOut().print(thePersonPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for performer tag ");
		}
		return SKIP_BODY;
	}
}

