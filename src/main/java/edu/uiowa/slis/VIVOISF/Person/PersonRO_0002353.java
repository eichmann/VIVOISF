package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonRO_0002353Iterator thePersonRO_0002353Iterator = (PersonRO_0002353Iterator)findAncestorWithClass(this, PersonRO_0002353Iterator.class);
			pageContext.getOut().print(thePersonRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

