package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityRO_0000056Iterator theUniversityRO_0000056Iterator = (UniversityRO_0000056Iterator)findAncestorWithClass(this, UniversityRO_0000056Iterator.class);
			pageContext.getOut().print(theUniversityRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing University for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

