package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonERO_0000037Iterator thePersonERO_0000037Iterator = (PersonERO_0000037Iterator)findAncestorWithClass(this, PersonERO_0000037Iterator.class);
			pageContext.getOut().print(thePersonERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

