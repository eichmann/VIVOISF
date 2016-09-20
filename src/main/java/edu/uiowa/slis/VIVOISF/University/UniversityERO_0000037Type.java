package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityERO_0000037Iterator theUniversityERO_0000037Iterator = (UniversityERO_0000037Iterator)findAncestorWithClass(this, UniversityERO_0000037Iterator.class);
			pageContext.getOut().print(theUniversityERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing University for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

