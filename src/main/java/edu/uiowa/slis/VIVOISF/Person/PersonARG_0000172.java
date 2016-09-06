package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonARG_0000172 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonARG_0000172 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonARG_0000172.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonARG_0000172Iterator thePerson = (PersonARG_0000172Iterator)findAncestorWithClass(this, PersonARG_0000172Iterator.class);
			pageContext.getOut().print(thePerson.getARG_0000172());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for ARG_0000172 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for ARG_0000172 tag ");
		}
		return SKIP_BODY;
	}
}

