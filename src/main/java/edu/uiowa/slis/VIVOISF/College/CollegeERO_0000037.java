package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeERO_0000037 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeERO_0000037 currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeERO_0000037.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeERO_0000037Iterator theCollegeERO_0000037Iterator = (CollegeERO_0000037Iterator)findAncestorWithClass(this, CollegeERO_0000037Iterator.class);
			pageContext.getOut().print(theCollegeERO_0000037Iterator.getERO_0000037());
		} catch (Exception e) {
			log.error("Can't find enclosing College for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

