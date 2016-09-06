package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolERO_0001520Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolERO_0001520Type currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolERO_0001520Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolERO_0001520Iterator theSchoolERO_0001520Iterator = (SchoolERO_0001520Iterator)findAncestorWithClass(this, SchoolERO_0001520Iterator.class);
			pageContext.getOut().print(theSchoolERO_0001520Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

