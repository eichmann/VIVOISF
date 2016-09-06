package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityERO_0000031 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityERO_0000031 currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityERO_0000031.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityERO_0000031Iterator theUniversityERO_0000031Iterator = (UniversityERO_0000031Iterator)findAncestorWithClass(this, UniversityERO_0000031Iterator.class);
			pageContext.getOut().print(theUniversityERO_0000031Iterator.getERO_0000031());
		} catch (Exception e) {
			log.error("Can't find enclosing University for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

