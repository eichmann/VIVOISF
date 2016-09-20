package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonERO_0000397Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonERO_0000397Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonERO_0000397Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonERO_0000397Iterator thePersonERO_0000397Iterator = (PersonERO_0000397Iterator)findAncestorWithClass(this, PersonERO_0000397Iterator.class);
			pageContext.getOut().print(thePersonERO_0000397Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for ERO_0000397 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for ERO_0000397 tag ");
		}
		return SKIP_BODY;
	}
}

