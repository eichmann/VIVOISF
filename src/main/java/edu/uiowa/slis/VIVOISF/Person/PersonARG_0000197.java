package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonARG_0000197 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonARG_0000197 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonARG_0000197.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonARG_0000197Iterator thePerson = (PersonARG_0000197Iterator)findAncestorWithClass(this, PersonARG_0000197Iterator.class);
			pageContext.getOut().print(thePerson.getARG_0000197());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for ARG_0000197 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for ARG_0000197 tag ");
		}
		return SKIP_BODY;
	}
}

