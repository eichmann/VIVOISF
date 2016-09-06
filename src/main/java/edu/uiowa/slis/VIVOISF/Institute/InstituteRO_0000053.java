package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteRO_0000053Iterator theInstituteRO_0000053Iterator = (InstituteRO_0000053Iterator)findAncestorWithClass(this, InstituteRO_0000053Iterator.class);
			pageContext.getOut().print(theInstituteRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

