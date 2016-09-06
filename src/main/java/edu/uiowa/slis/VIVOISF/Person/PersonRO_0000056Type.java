package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonRO_0000056Iterator thePersonRO_0000056Iterator = (PersonRO_0000056Iterator)findAncestorWithClass(this, PersonRO_0000056Iterator.class);
			pageContext.getOut().print(thePersonRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

