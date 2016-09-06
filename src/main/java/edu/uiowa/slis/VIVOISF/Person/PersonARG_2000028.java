package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonARG_2000028Iterator thePersonARG_2000028Iterator = (PersonARG_2000028Iterator)findAncestorWithClass(this, PersonARG_2000028Iterator.class);
			pageContext.getOut().print(thePersonARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

