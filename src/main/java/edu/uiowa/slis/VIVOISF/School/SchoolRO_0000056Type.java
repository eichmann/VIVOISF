package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolRO_0000056Iterator theSchoolRO_0000056Iterator = (SchoolRO_0000056Iterator)findAncestorWithClass(this, SchoolRO_0000056Iterator.class);
			pageContext.getOut().print(theSchoolRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

