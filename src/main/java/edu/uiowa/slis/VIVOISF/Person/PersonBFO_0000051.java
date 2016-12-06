package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonBFO_0000051Iterator thePersonBFO_0000051Iterator = (PersonBFO_0000051Iterator)findAncestorWithClass(this, PersonBFO_0000051Iterator.class);
			pageContext.getOut().print(thePersonBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

