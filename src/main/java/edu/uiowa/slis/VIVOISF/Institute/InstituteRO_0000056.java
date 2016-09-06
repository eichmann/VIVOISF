package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteRO_0000056Iterator theInstituteRO_0000056Iterator = (InstituteRO_0000056Iterator)findAncestorWithClass(this, InstituteRO_0000056Iterator.class);
			pageContext.getOut().print(theInstituteRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

