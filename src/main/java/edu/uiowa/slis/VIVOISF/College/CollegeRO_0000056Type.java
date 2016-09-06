package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeRO_0000056Iterator theCollegeRO_0000056Iterator = (CollegeRO_0000056Iterator)findAncestorWithClass(this, CollegeRO_0000056Iterator.class);
			pageContext.getOut().print(theCollegeRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

