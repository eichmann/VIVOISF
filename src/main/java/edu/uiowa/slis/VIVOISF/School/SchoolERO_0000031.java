package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolERO_0000031 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolERO_0000031 currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolERO_0000031.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolERO_0000031Iterator theSchoolERO_0000031Iterator = (SchoolERO_0000031Iterator)findAncestorWithClass(this, SchoolERO_0000031Iterator.class);
			pageContext.getOut().print(theSchoolERO_0000031Iterator.getERO_0000031());
		} catch (Exception e) {
			log.error("Can't find enclosing School for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

