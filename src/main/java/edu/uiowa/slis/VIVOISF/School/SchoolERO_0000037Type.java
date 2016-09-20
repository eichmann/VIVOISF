package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolERO_0000037Iterator theSchoolERO_0000037Iterator = (SchoolERO_0000037Iterator)findAncestorWithClass(this, SchoolERO_0000037Iterator.class);
			pageContext.getOut().print(theSchoolERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

