package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeERO_0001520Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeERO_0001520Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeERO_0001520Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeERO_0001520Iterator theCollegeERO_0001520Iterator = (CollegeERO_0001520Iterator)findAncestorWithClass(this, CollegeERO_0001520Iterator.class);
			pageContext.getOut().print(theCollegeERO_0001520Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

