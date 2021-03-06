package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonRO_0001025Iterator thePersonRO_0001025Iterator = (PersonRO_0001025Iterator)findAncestorWithClass(this, PersonRO_0001025Iterator.class);
			pageContext.getOut().print(thePersonRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

