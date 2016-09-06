package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonTranslatorOfIterator thePersonTranslatorOfIterator = (PersonTranslatorOfIterator)findAncestorWithClass(this, PersonTranslatorOfIterator.class);
			pageContext.getOut().print(thePersonTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

