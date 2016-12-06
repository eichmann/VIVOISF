package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonBFO_0000050Iterator thePersonBFO_0000050Iterator = (PersonBFO_0000050Iterator)findAncestorWithClass(this, PersonBFO_0000050Iterator.class);
			pageContext.getOut().print(thePersonBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

