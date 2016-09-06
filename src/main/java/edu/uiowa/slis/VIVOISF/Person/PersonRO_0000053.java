package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonRO_0000053Iterator thePersonRO_0000053Iterator = (PersonRO_0000053Iterator)findAncestorWithClass(this, PersonRO_0000053Iterator.class);
			pageContext.getOut().print(thePersonRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

