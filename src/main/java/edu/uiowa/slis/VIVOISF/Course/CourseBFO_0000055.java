package edu.uiowa.slis.VIVOISF.Course;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourseBFO_0000055 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourseBFO_0000055 currentInstance = null;
	private static final Log log = LogFactory.getLog(CourseBFO_0000055.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourseBFO_0000055Iterator theCourseBFO_0000055Iterator = (CourseBFO_0000055Iterator)findAncestorWithClass(this, CourseBFO_0000055Iterator.class);
			pageContext.getOut().print(theCourseBFO_0000055Iterator.getBFO_0000055());
		} catch (Exception e) {
			log.error("Can't find enclosing Course for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Course for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

